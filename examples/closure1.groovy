// Przykład domknięcia i zwracania go
def file = new File('data.txt')

def printer = { line -> println line }

def Closure getPrinter() {
    { line -> println line }
}

file.eachLine(getPrinter())

for (line: new File('data.txt')) {
    println line
}
