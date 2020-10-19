myMap = [value: 42, foo: { val -> val * 2 }, 67: "cos" ]
println myMap.value
println myMap.foo(12)
println myMap[67]

lst = [1,2,3]

println 3 in lst

mp = ['a': 0, 'b': 13]
println 'a' in mp.keySet()
println 13 in mp.values()

def addFourMinus(a, b) {
    a + 4 - b
}

def curryFunction = { value, arg-> addFourMinus(value,arg) }

def curryFun = curryFunction.curry(10)

println curryFun(3)


//checkboard = ['a': [4: 'Pawn' ]]