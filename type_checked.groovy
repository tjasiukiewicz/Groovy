// TypeChecked
import groovy.transform.TypeChecked

//@TypeChecked
class Person {
    String name
    String surname
    
    //@TypeChecked
    String getFullName() { "$name $surname" }
    
    //@TypeChecked
    Integer getOther() { "bum bum" }
}

def john = new Person(name: 'John', surname: 'Johnson')
assert john.fullName == 'John Johnson'

assert true