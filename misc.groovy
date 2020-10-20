// misc...

addShutdownHook {
    println "Run on the end..."
}

class LowerCaseCategory {
    static String lower(String msg) {
        msg.toLowerCase()
    }
}

use(LowerCaseCategory) {
    assert "abracadabra" == "AbRacaDabra".lower()
}