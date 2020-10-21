// template
// $var - single var
// ${code} - eval single line Groovy code and insert result
// <%=code=%> - eval Groovy code and insert result
// <%code%> - eval Groovy code and NOT insert result

mail =
'''
${favor} ${salutation?salutation+' ':''}$firstname...

Prosimy o zapłatę ostatniej faktury VAT. W przeciwnym
wypadku grożą następujące konsekwencje:
<% threats.each { %>- $it 
<% } %> 
Bardzo dziękujemy że wybrała ${salutation} naszą firmę.
Mamy nadzieję że wyróżniamy się uprzejmością.
'''

def engine   = new groovy.text.SimpleTemplateEngine()       
def template = engine.createTemplate(mail)          
def binding  = [
    favor: 'Droga',                                            
    salutation: 'Pani',
    firstname : 'Małgorzato',
    threats     : ['dekapitacja',
                 'tarzanie w smole i pierzu']
]

assert template.make(binding).toString() ==
'''
Droga Pani Małgorzato...

Prosimy o zapłatę ostatniej faktury VAT. W przeciwnym
wypadku grożą następujące konsekwencje:
- dekapitacja 
- tarzanie w smole i pierzu 
 
Bardzo dziękujemy że wybrała Pani naszą firmę.
Mamy nadzieję że wyróżniamy się uprzejmością.
'''