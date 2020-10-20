// assert

def wrongAdd(a, b) {
    a == 2 && b == 2 ? 5: a + b
}

assert wrongAdd(2, 2) == 4
//assert wrongAdd(2, 2) == 4, "Hmm.. It's Error!"