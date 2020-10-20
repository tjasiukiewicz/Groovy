// JSON Builder
import groovy.json.JsonBuilder

def builder = new JsonBuilder()
builder.weeks {
  capacity '8'
  tasks(
    [{
      done '0'
      total '4'
      title 'backup'
    }, {
      done '0'
      total '1'
      title 'remove unnecessary file'
    }]
  )
}

assert builder.toString() == '{"weeks":{"capacity":"8","tasks":[' +
    '{"done":"0","total":"4","title":"backup"},' +
    '{"done":"0","total":"1","title":"remove unnecessary file"}' +
    ']}}'