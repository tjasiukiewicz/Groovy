package business

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

