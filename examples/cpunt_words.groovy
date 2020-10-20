// Zliczenie slow
words = [:] 
def file = new File('pan_tadeusz.txt')
file.eachLine{
    line ->
    line.split().each {
        wordKey = it //.toLowerCase()
        count = words.get(wordKey, 0) + 1
        words[wordKey] = count
    }
}
// Mapa slow i ich wystapien
println words
// Ostatni klucz w mapie
lastKey =  words.sort{it.value}.keySet().last()
println "$lastKey: ${words[lastKey]}"