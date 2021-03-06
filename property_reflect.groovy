// property reflect..
class MyClass {
    def first = 1
    def getSecond() { first * 2 } // ro obj.second
    public third = 3
    def myMethod() { }
}

def obj = new MyClass()

assert obj.hasProperty('first')
assert obj.respondsTo('myMethod')

def keys = ['first', 'second', 'class']
assert obj.properties.keySet() == new HashSet(keys)

assert 1 == obj.properties['first']
assert 1 == obj.properties.first

assert 1 == obj.first
assert 1 == obj['first']    // getAt('first')

def one = 'first'
def two = 'second'
obj[one] = obj[two]         // putAt(one)

println ([1,2,3].dump())
println ((new Date()).dump())
assert obj.dump() =~ 'first=2'