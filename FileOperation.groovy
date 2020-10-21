// File

file = new File('examples/data.txt')
file.each { println it }
assert file.any { it =~ /t./ }
assert 2 == file.findAll { it =~ /z./ }.size()
assert 5 == file.grep {it}.size()


file = new File('.')
println file.name
println file.absolutePath
println file.canonicalPath // /home/student <- $PWD ../../etc/../usr/../tmp  
println file.directory
// Other: java.io.File and GDK File... 