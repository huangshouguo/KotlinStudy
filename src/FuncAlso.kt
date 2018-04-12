fun main(args: Array<String>) {

    class TestUser {
        var name: String = ""
        var age: Int = 0

        override fun toString(): String {
            return "TestUser(name='$name', age=$age)"
        }
    }

    val user = TestUser()
    println("user = $user")

    val ret = user.also {
        it.name = "Kotlin"
        it.age = 100
    }

    println("ret = $ret, user = $user")
}