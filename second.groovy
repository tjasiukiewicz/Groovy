
def value1 = 'Ala'
def napis = "$value1"
println napis
println napis.class.name
println "${ 2 + 2 }"
def napis2 = '$value1'
println napis2

def myValue = 7898787668698789879890980890.898
println myValue.class.name

(10..15).each { println it }
(10..<15).each { println it }
(15..10).each({println it })
(0..10).step(2) { println it }

two = null
msg = two ?: "Inny"

println msg

def lst = [10, 20, 30]
println lst[2..0]
println lst.getAt(0..2)

//println lst.1

myMap = [name: "Tola"]
println myMap.name
myMap2 = ["chce miec trudno": 42]
println myMap2."chce miec trudno"

hereDoc = """
Dodać $myMap
Jakiś 
długi 
napis
"""
println hereDoc

lst2 = ["Ala", 12, 1223.3, 12, 42]
lst2 -= 12
println lst2

lst2 = [1, 2, 3, [10, 20, 30]]
println lst2.flatten()

def foo(value) {
    println "Object: $value"
}

def foo(String str) {
    println "String: $str"
}

def foo(Integer i) {
    println "Integer: $i"
}

myList = ["napis", 23, 33, new Date()]
myList.each { element -> foo(element) }

prices = [12.4, 56.3, 10.0, 34.3]
println prices.collect{ it * 1.23 }

result = []
for(value: prices) {
    result += value * 1.23
}
println result

println ("-~" * 10)

def piramida(size) {
}

piramida(5)
  
  *
 ***
*****