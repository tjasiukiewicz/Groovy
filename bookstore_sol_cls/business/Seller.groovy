package business

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

