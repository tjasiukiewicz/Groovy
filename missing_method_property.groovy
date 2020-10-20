// MethodMissing
class X {
    Closure callForMethod = { name, args -> "call X.$name($args)" }
    Closure callForProperty = { name -> "access X.$name" }
    
    def methodMissing(String name, Object args) {
        callForMethod(name, args)
    }
    def propertyMissing(String name) {
        callForProperty(name)
    }
}

def x = new X()
assert x.abracadabra('bum', 'bum', 12) == 'call X.abracadabra([bum, bum, 12])'
assert x.myManaCounter == 'access X.myManaCounter'

// Dynamic change behavior
x.callForMethod = { name, _ -> "call ${name.toUpperCase()}" }
x.callForProperty = { name -> "access ${name.toUpperCase()}" }
assert x.abracadabra() == 'call ABRACADABRA'
assert x.manamanam == 'access MANAMANAM'