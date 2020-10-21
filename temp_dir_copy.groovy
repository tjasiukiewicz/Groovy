// Temp dir & copy file

File tempDir = File.createTempDir() // Linux -> /tmp

assert tempDir.directorySize() == 0 // empty dir

File source = new File(tempDir, 'in.dat')
source.bytes = "any data".bytes

assert tempDir.directorySize() == "any data".size()

File destination = new File(tempDir, 'out.dat')

destination.withDataOutputStream { os->
    source.withDataInputStream { is->
        os << is
    }
}

assert tempDir.directorySize() == ("any data".size() * 2)

tempDir.deleteDir()