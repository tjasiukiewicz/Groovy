import groovy.xml.MarkupBuilder
import groovy.xml.XmlSlurper

def writer = new FileWriter('/tmp/family.xml')
def document = new MarkupBuilder(writer)

document.family {
    father (sex:'male', age: 39, "Tomasz")
    wife (sex:'male', age: 38, "Zofia")
    childs  {
        [['Antoni', 12], ['Wojciech', 5], ['Piotr', 3]].each { chdName, ags ->
            child (sex:'male', age:ags, chdName)
        }
    }
}

def inputDoc = new XmlSlurper().parse(new File('/tmp/family.xml'))
inputDoc.childs.child.each {
    println "Child: $it\t Sex: ${it.@sex}\t Age: ${it.@age}"
}

println inputDoc.father // Father
println inputDoc.childs.child[1] // second child