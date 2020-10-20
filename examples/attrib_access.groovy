// Access to attrib
class Box {
    public value = 0
}

def box = new Box()

box.value = 1

println box.value

def attribName = 'value'
box[attribName] = 2
print "$box.value, ${box['value']}"