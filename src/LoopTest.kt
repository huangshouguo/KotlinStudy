fun main(args: Array<String>) {
    for (i in 1..10){
        println(i)
    }

    for (i in 1..10 step 3){
        println(i)
    }

    for (i in 10 downTo 1){
        println(i)
    }

    for (i in 10 downTo 1 step 6){
        println(i)
    }

    println("------")
    for (i in 0 until 10){
        println(i)
    }
    println("------")


    val array = arrayOf("A", "B", "C", "D")
    for (item in array) {
        println(item)
    }

    for (index in array.indices){
        println(array[index])
    }

    for ((index, value) in array.withIndex()) {
        println("index = $index, value = $value")
    }




//    val list = listOf("A", "B", "C", "D")
//
//    for (item: String in list) {
//        println(item)
//    }
//
//    for (item in list) {
//        println(item)
//    }
//
//    for (index in list.indices){
//        println(list[index])
//    }
//
//    for ((index, value) in list.withIndex()) {
//        println("index = $index, value = $value")
//    }
}