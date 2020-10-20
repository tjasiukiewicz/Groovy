// Memoization
def fibonacci
fibonacci = { it < 2 ? 1: fibonacci(it - 1) + fibonacci(it - 2) }

start = System.nanoTime()
println "Result: ${fibonacci(36)}"
stop = System.nanoTime()
println "Recursion: ${stop - start}"

fibonacci = fibonacci.memoize()
start = System.nanoTime()
println "Result: ${fibonacci(36)}"
stop = System.nanoTime()
println "Memoize  : ${stop - start}"