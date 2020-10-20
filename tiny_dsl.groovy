// GroovyObject MOP
/* 
//   GrovyObject skeleton

public interface GroovyObject {
    Object invokeMethod(String methodName, Object args);
    Object getProperty(String propertyName);
    void setProperty(String propertyName, Object newValue);
    MetaClass getMetaClass();
    void setMetaClass(MetaClass metaClass);
}

//    GrovyObjectSupport skeleton
    
public abstract class GroovyObjectSupport implements GroovyObject {
    public Object invokeMethod(String name, Object args) {
        return getMetaClass().invokeMethod(this, name, args);
    }
    public Object getProperty(String property) {
        return getMetaClass().getProperty(this, property);
    }
    public void setProperty(String property, Object newValue) {
        getMetaClass().setProperty(this, property, newValue);
    }
    // and more...
}
*/


// Tiny DSL. Call toString without parentheses
class X {
    def getProperty(String propertyName) {
        if (metaClass.hasProperty(this, propertyName)) {
            return metaClass.getProperty(this, propertyName)
        }
        invokeMethod propertyName, null
    }
}

class Y extends X {
    boolean myProperty = true
}

def y = new Y()
assert y.myProperty
assert y.toString() == y.toString // <- no parentheses!