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
	def addBook(book) { }
	def removeBook(book) { }
	String toString() { }
}

class Person {
	private String name
	private String address
	Person(String name, String address) { }
	String toString() { }
}

class Seller {
	def addBook(book, box) { }
	def removeBook(book, box) { }
	def send(box) { }
}

class Book {
	String title
	BigDecimal price
}
