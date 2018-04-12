interface IActionTest {
    fun action()
}

fun doSth(actionTest: IActionTest) {
    actionTest.action()
}

fun main(args: Array<String>) {

    doSth(object : IActionTest {
        override fun action() {
            println("object: action")
        }
    })
}