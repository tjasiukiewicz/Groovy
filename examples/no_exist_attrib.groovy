// Atrrib ? No exists !!
class X {

    Object get(String name) {
        "get() $name\n"
    }
    
    void set(String name, Object value) {
        println "set() $value\n"
    }
}

def x = new X()
println x.noExist

x.boom = 'moose'