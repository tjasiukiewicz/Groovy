// assert

def wrongAdd(a, b) {
    a == 2 && b == 2 ? 5: a + b
}

//assert wrongAdd(2, 2) == 4
//assert wrongAdd(2, 2) == 4, "Hmm.. It's Error!"
lst = [1, 2, 3]
//assert lst.tail() == [2, 1]

def divide(a, b) {
    assert b != 0
    a / b
}

divide(12, 0)