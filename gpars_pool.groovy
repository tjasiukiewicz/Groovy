// GPars map -> reduce
import static groovyx.gpars.GParsPool.withPool

withPool {
    assert 55 == [0, 1, 2, 3, 4].parallel
        .map    { it + 1  }
        .map    { it ** 2 }
        .reduce { a, b -> a + b }
}

withPool(3) {
    def numbers = [1, 2, 3, 4, 5, 6]
    assert [1, 4, 9] == numbers.parallel
        .map { it * it }
        .filter { it < 10 }
        .collection
}
