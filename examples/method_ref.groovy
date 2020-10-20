// Referencja na metodę
class LengthFilter {
    Integer minValue
    Integer maxValue
    
    boolean inRange(String value) {
        value.size() >= minValue && value.size() <= maxValue
    }
}

LengthFilter tinyFilter = new LengthFilter(minValue:1, maxValue:3)
LengthFilter mediumFilter = new LengthFilter(minValue:3, maxValue:6)

def data = ['o', 'no', 'mato', 'peja', 'kracze', 'płot', 'ruda żelaza']

println data.findAll(tinyFilter.&inRange)
println data.findAll(mediumFilter.&inRange)

Closure adhocFilter = new LengthFilter(minValue:6, maxValue:12).&inRange

println data.findAll(adhocFilter) 