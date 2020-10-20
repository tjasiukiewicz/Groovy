// Recursion

def badLastElement
badLastElement = { it.size() == 1 ? it.head(): badLastElement(it.tail()) }

// Crash!!
//println badLastElement(0..10_000)

def goodLastElement
goodLastElement = { it.size() == 1 ? it.head(): goodLastElement.trampoline(it.tail()) }

goodLastElement = goodLastElement.trampoline()

println goodLastElement(0..10_000)