// Constructors
//
// Position parameters
//
class Person {
    String name
    Integer age
    Person(name, age) {
        this.name = name
        this.age = age
    }
}

def john = new Person('John', 22)
def rebeca = ['Rebeca', 33] as Person
Person tom = ['Tom', 44]

//
// Named parameters
//
class SimpleProduct {
    String name
    Float price // Huh? Float?
}

new SimpleProduct()
new SimpleProduct(name:'Car', price:3234.4)
new SimpleProduct(name:'House')
product = new SimpleProduct(price: 65.1)
product.name = "saw"

//
// Implict constructor
//
java.awt.Dimension area
area = [322, 33]
println "$area.width, $area.height"