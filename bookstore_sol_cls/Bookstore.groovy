import business.*

// (US1)
def person = new Person('Adam Zazol', 'Koluszki 03-331 Zagumienna 8')
def box = new Box(owner:person)
// (US2)
def book1 = new Book(title:'W kuchni i lesie', price: 323.33)
def book2 = new Book(title:'Oko za rogiem', price: 21.1)
def seller = new Seller()
seller.addBook(book1, box)
seller.addBook(book2, box)
// (US3)
seller.send(box)

