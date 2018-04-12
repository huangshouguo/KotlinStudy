fun main(args: Array<String>) {

    data class TestUser(val name: String, val age: Int)

    var user = TestUser("Jim", 20)

    with(user) {
        println("name = $name")
        println("age = ${this.age}")
    }

}

