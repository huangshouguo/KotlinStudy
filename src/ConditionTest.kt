fun main(args: Array<String>) {

    val random = (Math.random() * 10).toInt()
    println("random = $random")


    // if语句
    var retIf = 0

//    if (random > 5) {
//        retIf = 1
//    } else {
//        retIf = 2
//    }

//    retIf = if (random > 5) {
//        1
//    } else {
//        2
//    }

    retIf = if (random > 5) 1 else 2

//    println("retIf = $retIf")


//    if (random > 2 && random < 5) {
//        println("range: random =$random (2 < random < 5)")
//    }

    if (random in 3..6) {
        println("range: random =$random (2 < random < 5)")
    }





    when (random) {
        0 -> println("nothing")
        1 -> println("one")
        else -> println("more")
    }

    when (random) {
        0 -> println("nothing")
        1, 2 -> println("one or two")
        else -> println("more than 2")
    }

    val retWhen:Any = when (random) {
        0 -> "nothing"
        in 1..5 -> "[1,5]"
        !in 2..6 -> "[0,2) & (6,10]"
        else -> random
    }

//    if (retWhen is String){
        val a = retWhen as? Int
//    }


    println("retWhen = $retWhen, a = $a")

}