Object foo(val) {
    if (val % 2 == 0) {
        return "Parzysta"
    }
    return 42
}

//println foo("hjh")
lst = ['a', 67876876.32, 78768, new Date()]

String[] sTable = ["a", 12, "to"] // Autoboxing

/*
10 -> 1, 2, 5, 10
8 -> 1, 2, 4, 8
6 -> 1, 2, 3, 6
*/
def dividers(value) {
    //divids = []
    /*
    for(a = 1; a <= (value / 2); a++) {
        if (value % a == 0) {
            divids << a
        }
    }
    return divids
    */
    
    (1..(value / 2)).findAll {
        ! (value % it)
    }
}

def isPerfectNumber(value) {
    dividers(value).sum() == value
}

def perfectNumberInRange(minValue, maxValue) {
    (minValue..maxValue).findAll {
        isPerfectNumber(it)
    }
}

perfectNumberInRange(1, 100)