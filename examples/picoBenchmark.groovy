// Closure picoBenchmark

def picoBenchmark(int repeatCounter, Closure worker) {
    def startTime = System.nanoTime()
    
    repeatCounter.times { worker(it) }
    
    def stopTime = System.nanoTime()
    
    stopTime - startTime
}

def time1 = picoBenchmark(1000000) { it.power(2) }
def time2 = picoBenchmark(1000000) { it * it }

println "time1: $time1\ntime2: $time2"