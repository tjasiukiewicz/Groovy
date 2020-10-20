// Switch classificator

//def value = 0
//def value = 4
//def value = 12
//def value = 1000
//Float value = 3.14
def value = 99

switch(value) {
    case 0:             println "0"; break
    case 0..5:          println "0..5"; break
    case [1, 12, 15]:   println "[1, 12, 15]"; break
    case Float:         println "Float"; break
    case {it % 5 == 0}: println "it % 5"; break
    case ~/../:         println "~/../"; break
    default:            prinln "default"
}
