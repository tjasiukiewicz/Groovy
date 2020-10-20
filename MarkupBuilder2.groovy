// MarkupBuilder 2
import groovy.xml.MarkupBuilder

TimeZone.default = TimeZone.getTimeZone("CET")

def writer = new StringWriter()
def builder = new MarkupBuilder(writer)

builder.invoices {
    for (day in 1..3) {
        def invDate = Date.parse('yyyy-MM-dd', "2020-12-0$day")
        invoice(date: invDate) {
            item(count: day) {
                product(name: 'ULC', dollar: 1499)
            }
        }
    }
}

assert '\n' + writer.toString() == """
<invoices>
  <invoice date='Tue Dec 01 00:00:00 CET 2020'>
    <item count='1'>
      <product name='ULC' dollar='1499' />
    </item>
  </invoice>
  <invoice date='Wed Dec 02 00:00:00 CET 2020'>
    <item count='2'>
      <product name='ULC' dollar='1499' />
    </item>
  </invoice>
  <invoice date='Thu Dec 03 00:00:00 CET 2020'>
    <item count='3'>
      <product name='ULC' dollar='1499' />
    </item>
  </invoice>
</invoices>"""