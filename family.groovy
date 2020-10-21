import groovy.xml.MarkupBuilder
import groovy.xml.XmlSlurper

def writer = new StringWriter()
def document = new MarkupBuilder(writer)

document.family {
    father "Tomasz"
    wife "Zofia"
    childs  {
        ['Antoni', 'Wojciech', 'Piotr'].each { chd ->
            child chd
        }
    }
}

new File('/tmp/family.xml').text = writer.toString()

def inputDoc = new XmlSlurper().parse(new File('/tmp/family.xml'))
inputDoc.childs.child.each {
    println it
}

println inputDoc.childs.child[1]