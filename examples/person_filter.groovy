class Person {
    String name
    Integer age
    String toString() {
        "Person: $this.name $this.age"
    }
}

persons = []
for (item: [['John', 12], ['Rebeca', 20], ['Tom', 40], ['Andrew', 33]]) {
    persons << new Person(name:item[0], age:item[1])
}

persons.findAll { it.age > 18 && it.age < 40 } .each {
    println "Person: $it.name $it.age"
}

println persons[0]