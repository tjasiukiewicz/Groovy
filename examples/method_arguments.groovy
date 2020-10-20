// Method arguments
class X {
    def addDefault(a, b, c = 0) {
        return a + b + c
    }
    def addInList(List args) {
        return args.sum()
    }
    def variadicAdd(a, b, Object[] optionals) {
        return a + b + optionals.toList().sum()
    }
    def addInMap(Map args) {
        ['a', 'b', 'c'].each { args.get(it, 0) }
        return args.a + args.b + args.c
    }
}

def x = new X()

println x.addDefault(1, 2)
println x.addDefault(1, 2, 3)
println x.addInList([1, 2, 3])
println x.variadicAdd(1, 2, 3, 4, 5, 6)
println x.addInMap(a:1, b:2, c:3)