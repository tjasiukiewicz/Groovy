// MarkupBuilder

def builder = new groovy.xml.MarkupBuilder()

builder.items {

    description 'XML Items data'
    
    (20..30).each { index ->
        item (value: index, powerTwo: index * index) {
            for (j in 2..<index) {
                if (index % j == 0) {
                    factor (value: j)
                }
            }
        }
    }
}