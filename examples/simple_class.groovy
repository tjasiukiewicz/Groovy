// Class
class X {
    public modifiedField
    String typedField
    def untypedField
    protected field1, field2
    private assignedField = new Date()
    
    static classField
    public static final String PI_STR = "3.1415"
    
    def myMethod() {
        def localUntypedMethodVar = 1
        int localTypedMethodVar = 1
        def localVarWithoutAssigment, other
    }
}

def localVar = 1
boundVar = 1

def myMethod() {
    def localMethodVar = 1
    boundVar2 = 1
}

myMethod()