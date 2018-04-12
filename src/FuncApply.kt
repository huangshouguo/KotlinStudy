fun main(args: Array<String>) {
    class TestUser {
        var name: String = ""
        var age: Int = 0

        override fun toString(): String {
            return "TestUser(name='$name', age=$age)"
        }
    }

    val user = TestUser()
    println("before: user = $user")

    val user2 = user.apply {
        this.age = 20
        this.name = "Google"
    }

    println("after: user2 = $user2, user = $user")
}