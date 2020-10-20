/*
myList = [1, 2, 3]
myList[3] = 12
myList.addAll([1, 2, 3])
println myList
println myList.isCase(2)
candidate = 3
switch(candidate) {
    case myList: println "Jest na liście"; break
    default: println "Nie ma na liście"
}
println ([1, 4, 12].grep(myList))
for (val in ['a', 'b', 'c']) {
    println val
}
println ([1, 2, 3, [1, 3, 4]].flatten())
println ([1, 2, 3].intersect([12, 2]))
println ([1, 2, 3].disjoint([12, 2]))
//println ([1, 2, 3].addAll([12, 2]))
myList <<= 100
println myList
popped = myList.pop()
println popped
myList.push(0)
println myList
myList = myList.collect{ item -> item * 3 }
println myList
myList.removeAll([9])
println myList
myList.sort{ a, b -> b <=> a }
println myList
println myList.findAll{ ! (it % 2) }
println myList.first()
println myList.last()
println myList
println new HashSet(myList).toList()
println myList.unique()
myList.eachWithIndex{ item, index -> println "$item : $index" }
println myList.permutations().take(3)
println 10.intdiv(3)
mp = [1: 'a', 2 : 'c']
println ('a' in mp.values())
println mp.values().join('/')
println ("Ala ma kota".tokenize())

def add(a, b) {
    {a + b}
}
println(add(12, 12))
*/
log = ''
(1..10).each { log += it }
println log

class Garderoba {
    String skarpetki = 'chińskie'
}
class Kup {
    def call(String val) {
        println val
        return new Garderoba(skarpetki:"$val" + ' z gumkom')
    }
}

rodzajGarderoby = new Garderoba(skarpetki:'niemieckie')
kup = new Kup()
println (kup 'czarne' skarpetki)

class SizeFilter {
    Integer limit
    boolean sizeUpTo(String value) {
        return value.size() <= limit
    }
}

SizeFilter filter6 = new SizeFilter(limit:6)
SizeFilter filter5 = new SizeFilter(limit:5)

sizeUpTo6 = filter6.&sizeUpTo

def words = ['long string', 'medium', 'short', 'tiny']
println words.find(sizeUpTo6)
println words.find(filter5.&sizeUpTo)
println ((filter5.&sizeUpTo).getClass())

items = [12, 'blok', [10, 12]]

class MultiMethod {
    def resolve(Integer val) {
        "Integer: $val"
    }
    def resolve(String val) {
        "String: $val"
    }
    def resolve(List val) {
        "List: $val"
    }
}
MultiMethod instance = new MultiMethod()
multi = instance.&resolve
items.collect(new MultiMethod().&resolve)

fib = { it < 2 ? 1: fib(it - 1) + fib(it - 2) }
fib = fib.memoize()
println (fib(40))

mp = [:]
mp.run = { a -> a * 2 }

println (mp.run(12))
println mp
println this.class.methods.name.grep(~/get.*/).sort()