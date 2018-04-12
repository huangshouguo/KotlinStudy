fun main(args: Array<String>) {

    //默认不可继承，使用open修饰后可继承
    open class Base

    class Child : Base()

    //init函数构造函数
    class InitTestClass(var property: String?) {
        init {
            if (this.property == null) {
                this.property = "Hello World"
            }
        }
    }

    println(InitTestClass("Hello Kotlin").property)
}