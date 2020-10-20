// Closure declaration
// (1)
Map map = ['c': 12, 'b': 44, 'a': 32]
map.each { key, value -> map[key] = value * 2 }
println map

// (2)
Closure doubler = { key, value -> map[key] = value * 2 }
map.each(doubler)
println map

// (3)
def doubleMethod(item) {
    item.value = item.value * 2
}

map.each(this.&doubleMethod)
println map