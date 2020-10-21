// Traversing file
import static groovy.io.FileType.DIRECTORIES
import static groovy.io.FileType.FILES

def topDir = new File('/')
def srcDir = new File(topDir, 'etc')

dirs = []
srcDir.eachDir { dirs << it.name }
assert  dirs.containsAll(['default', 'dpkg'])

dirs = []
srcDir.eachDirRecurse { dirs << it.name }
assert dirs.containsAll(['modprobe.d', 'pki'])


count = 0
srcDir.eachFileRecurse { if (it.directory) count++ }
println "$count directories in $srcDir.name"

count = 0
srcDir.eachFileRecurse(DIRECTORIES) { count++ }
println "$count directories in $srcDir.name"
