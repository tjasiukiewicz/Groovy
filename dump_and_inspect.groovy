// dump and inspect

def separator() {
    println "-" * 20
}

def message = "Tora tora... tora\n"

println message.dump()
separator() 
println message.inspect()

class Person {
    def String name
    def Integer age
}

def person = new Person(name:'John', age: 33)
separator()
println person.dump()
separator()
println person.inspect()
groovy.inspect.swingui.ObjectBrowser.inspect(person) // start ObjBrowser

separator()
println person.properties