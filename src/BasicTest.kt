fun main(args: Array<String>) {

    //只读变量定义
    val testValStr = "Hello Kotlin"
//    testValStr = "Hello World" //报错

    //可变变量定义
    var testVarStr = "Hello Android"
    testVarStr = "Hello Java"


    //严格数据类型
    val testInt = 100
//    val testLong: Long = testInt //报错
    val testLong: Long = testInt.toLong()


    //字符串模版
    println("This is string template: " +
            "testInt = $testInt, " +
            "express = ${testInt + 10}")

}