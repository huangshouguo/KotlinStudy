fun main(args: Array<String>) {

    val list = listOf(1, 2)
    list.let {
        println(it)
        it.forEach { it }
    }

    val ret = "testLet".let {
        println("inner: it = $it")

        if (it == "testLet") {
            "retTestLet"
        } else {
            "retNotTestLet"
        }
    }

    println("ret = $ret")

}