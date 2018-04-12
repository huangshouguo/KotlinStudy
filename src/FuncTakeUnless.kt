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

    var ret = user.takeUnless {
        it.age > 0
    }

    println("ret = $ret, user = $user")

    user.age = 100
    ret = user.takeUnless {
        it.age > 0
    }

    println("ret = $ret, user = $user")
}