// writing to file
new File("/tmp/misc.txt").text = 'misc data'

def outFile = new File('/tmp/misc.txt')

def lines = ['ono','mato','peja']

outFile.write(lines[0..1].join("\n"))
outFile.append("\n"+lines[2])

assert lines == outFile.readLines()

outFile.withWriter { writer ->
  writer.writeLine(lines[0])
}

outFile.withWriterAppend('UTF-8') { writer ->
  writer << "żółtko" << "\n"
}

outFile << lines[2]