// main() run
// 
// Compile:
// groovyc -d MyClass MyClass.groovy
//
// Run:
// java -cp $GROOVY_HOME/lib/groovy-x.y.z.jar:MyClass MyClass a b c 12

class MyClass {
    public static main(args) {
        println "MyClass.main($args)"
    }
}