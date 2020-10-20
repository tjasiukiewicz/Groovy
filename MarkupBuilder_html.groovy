// MarkupBuilder -> html

def writer = new FileWriter('markup.html')
def html = new groovy.xml.MarkupBuilder(writer)
html.html {
    head {
        title 'Strona tworzona z uzyciem MarkupBuilder'
    }
    body {
        h1 'Jakie operacje sa mozliwe?'
        form (action:'send_to_server') {
            for (line in ['Tworzenie HTML','Tworzenie XML','Tworzenie innych cosi']){
                input(type:'checkbox',checked:'checked', id:line, '')
                label(for:line, line)
                br()
            } 
        } 
    }
}