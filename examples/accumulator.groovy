// Function accumulator
def adder(n) {
    return { n += it }
}

def accumulator = adder(5)

println accumulator(1)
println accumulator(3)