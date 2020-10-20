// Case classification
def even = { ! (it % 2) }

println ([1, 2, 3, 4, 5].grep(even))

switch(10) {
    case even : println "is even"; break
    default: println "is odd" 
}

val = 1

// old way... 
switch(val) {
    case 1:
        println "jedynka"
        break
    case 2:
        println "dwojka"
        break
    default:
        println "cos innego"
}