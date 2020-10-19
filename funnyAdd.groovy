 /*
 45 -> 45 + 54 -> 99 
 
 ..
 ..
 45: 1 99
 46: 2 121
 ..
 99: 0 99 
 
 1..100 
 */
 
 def funnyAdd(a) {
     a.toString().reverse().toBigDecimal() + a
 }
 
 def isPalindromic(a) {
     a.toString() == a.toString().reverse()
 }
 
 def showFunnyAdd(minValue, maxValue) {
     (minValue..maxValue).each {
         counter = 0
         value = it
         while(! isPalindromic(value)) {
             value = funnyAdd(value)
             ++counter
         }
         println "$it: $counter $value"
     }  
 }
 

 showFunnyAdd(1, 100)
 