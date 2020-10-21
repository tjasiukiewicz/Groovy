// TypeChecked
import groovy.transform.TypeChecked

@TypeChecked // @StaticCompile
class Person {
    String name
    String surname
    Person(name, surname) {
        this.name = name
        this.surname = surname
    }
    
    //@TypeChecked 
    String getFullName() { "$name $surname" }
    
    //@TypeChecked
    //Integer getOther() { "bum bum" }
    
    Object makeFullName(name, surname) {
        45
    }
}

def john = new Person('John', 'Johnson')
assert john.fullName == 'John Johnson'

assert true