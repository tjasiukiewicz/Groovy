// MultiMethod and ref
class MultiMethod {
    int consume(String value) {
        value.size()
    }
    def consume(List lst) {
        "List: $lst"
    }
    int consume(int x, int y) {
        x + y
    }
}

MultiMethod instance = new MultiMethod()
Closure multi = instance.&consume

println multi('no way')
println multi([1, 2, 3])
println multi(10, 20)