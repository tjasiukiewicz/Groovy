//
// Uwaga, kod jest niekompletny i wymaga poprawek. Zmiany nazw, 
//      dodania atrybutów, dodania/zmiany metod...
//
// US1: Zamówienie
//  1. Tworzone są obiekty: Klienta, Sprzedawcy i Paczki
//  2. Klient posiada nazwę i adres
//  3. Do paczki przypisany jest klient
//
// US2: Sprzedawca dodaje do paczki określone książki
//
// US3: Sprzedawca wysyła paczkę do klienta
//  - system wyprowadza na konsolę raport z:
//   * Właścicielem paczki
//   * Adresem wysyłki 
//   * Zawartością paczki
//   * Wartością paczki (suma należności)
//

class  Box {
	Person owner
	def books = []
	def addBook(book) {
		books << book
	}
	def removeBook(book) {
		books -= book
	}
	String toString() {
		def lineSeparator = '=' * 40
		def result = "Box\n$lineSeparator\n$owner\n$lineSeparator\n"
		def sumPrices = 0
		books.each { book ->
			result += "Title: $book.title\tPrice: $book.price\n"
			sumPrices += book.price
		}
		result += "$lineSeparator\nSum: $sumPrices"
		result
	}
}

class Person {
	private String name
	private String address
	Person(String name, String address) {
		this.name = name
		this.address = address
	}
	String toString() {
		"Name: $name\nAddress: $address"
	}
}

class Seller {
	def addBook(book, box) {
		box.addBook(book)
	}
	def removeBook(book, box) {
		box.removeBook(book)
	}
	def send(box) {
		println box
	}
}

class Book {
	String title
	BigDecimal price
}

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

