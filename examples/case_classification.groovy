// Case classification
def even = { ! (it % 2) }

println ([1, 2, 3, 4, 5].grep(even))

switch(10) {
    case even : println "is even"; break
    default: println "is odd" 
}