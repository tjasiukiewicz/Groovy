// object serialize
// req: object is serializable
file = new File('objects.dat')
file.deleteOnExit()

objects = [1, "Little text", new Date()]
file.withObjectOutputStream { outstream ->
  objects.each {
    outstream << it
  }
}

retrieved = []
file.withObjectInputStream { instream ->
  instream.eachObject {
    retrieved << it
  }
}

assert retrieved == objects