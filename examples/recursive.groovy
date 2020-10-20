// Recursion

def badLastElement
badLastElement = { it.size() == 1 ? it.head(): badLastElement(it.tail()) }

// [1, 2, 3] -> lst.head() == 1, lst.tail() == [2, 3]

// Crash!!
//println badLastElement(0..10_000)

def goodLastElement
goodLastElement = { it.size() == 1 ? it.head(): goodLastElement.trampoline(it.tail()) }

goodLastElement = goodLastElement.trampoline()

println goodLastElement(0..10_000)