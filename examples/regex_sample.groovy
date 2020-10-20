// Regex operator
//
// =~      - find
// ==~     - match
// ~string - pattern
//
def twister = 'drabina z powylamywanymi nogami'

assert twister =~ /d.a/

def finder = (twister =~ /d.*a/)
assert finder instanceof java.util.regex.Matcher

assert ! (twister ==~ /(\w+ \w+)*/)

def WORD = /\w+/
matches = (twister ==~ /($WORD $WORD)*/)
assert matches instanceof java.lang.Boolean

assert !(twister ==~ /d.*a/)

def wordsByX = twister.replaceAll(WORD, 'x')
assert wordsByX == 'x x x x'

def words = twister.split(/ /)
assert words.size() == 4
assert words[0] == 'drabina'
