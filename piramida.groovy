def piramida(Integer size) {
    for(stars: (0..size).step(2)) {
        println ' ' * ((size  - stars) / 2) + '*' * (stars + 1)
    }
}

def piramida2(Integer size) {
    result = []
    (0..size).step(2) {
        result += ' ' * ((size - it) / 2) + '*' * (it + 1)
    }
    print result.join('\n')
}

piramida(7)
piramida2(7)