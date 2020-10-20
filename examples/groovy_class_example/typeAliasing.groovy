import oldlib.Calculate as WrongCalculate

class Calculate extends WrongCalculate {
    Integer doubles(Integer value) {
        return value * 2
    }
}

assert 20 == new Calculate().doubles(10)
