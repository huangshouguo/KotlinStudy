fun main(args: Array<String>) {

    class Test {
        fun doSomething(from: String) {
            println("doSomething: from = $from")
        }
    }

    fun action(test: Test) {
        // do something
    }

    val random = (Math.random() * 10).toInt()
    println("random = $random")

    var test: Test? = if (random > 5) Test() else null

    test?.doSomething("?.")

//    if (test != null) {
        test!!.doSomething("!!")
//    }


    if (test != null) {
        action(test!!)
    }

    val retNotNullTest = test ?: Test()
    retNotNullTest.doSomething("?:")
}