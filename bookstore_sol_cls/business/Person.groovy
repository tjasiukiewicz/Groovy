package business

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

