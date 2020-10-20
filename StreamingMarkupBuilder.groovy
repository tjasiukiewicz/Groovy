// StreamingMarkupBuilder
def builder = new groovy.xml.StreamingMarkupBuilder()
def writable = builder.bind {
  invoices {
    for (day in 1..3) {
      def invDate = Date.parse('yyyy-MM-dd', "2020-12-0$day")
      invoice(date: invDate) {
        item(count: day) {
          product(name: 'ULC', price: 6699)
        }
      }
    }
  }
}

def result = writable.toString()
assert result.startsWith("<invoices><invoice date='Tue Dec 01")
assert result.endsWith('</invoice></invoices>')