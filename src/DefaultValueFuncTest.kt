fun main(args: Array<String>) {


    fun printPerson(name: String = "NoName", age: Int = 20) {
        println("name = $name, age = $age")
    }

    printPerson("kkk")
    printPerson("Google")
    printPerson(age = 100)
    printPerson("Kotlin", 200)
}