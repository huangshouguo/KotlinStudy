import kotlin.properties.Delegates
import kotlin.reflect.KProperty

interface IClassDelegateTest {
    fun doSth()
}

class ClassDelegateTestImpl(val param: Int) : IClassDelegateTest {
    override fun doSth() {
        println("ClassDelegateTestImpl -- doth(): param = $param")
    }
}

class TestClassDelegate(ct: IClassDelegateTest) : IClassDelegateTest by ct
//class TestClassDelegate(ct: IClassDelegateTest): IClassDelegateTest by ct{
//    override fun doSth() {
//        println("TestClassDelegate -- doSth")
//    }
//}


class PropertyDelegateTest {
    var p: String by DelegateClass()
}

class DelegateClass {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}




class ObserverBean {
    var property: String by Delegates.observable("NoName") { property, oldValue, newValue ->
        println("$property: $oldValue --> $newValue")
    }
}

class  Tet{
    val a:String by lazy {
        "s"
    }
}

fun main(args: Array<String>) {


//    TestClassDelegate(ClassDelegateTestImpl(100)).doSth()


//    val e = PropertyDelegateTest()
//    e.p = "Main"
//    println(e.p)


    val lazyValue: String by lazy {
        println("This is thread safety!")
        "Hello Lazy Boy!"
    }

    println(lazyValue)
    println(lazyValue)
    println(lazyValue)


//    val lazyValue2: String by lazy(LazyThreadSafetyMode.NONE) {
//        println("This is not thread safety!")
//        "Hello Lazy Boy!"
//    }
//
//    println(lazyValue2)
//    println(lazyValue2)
//    println(lazyValue2)




    val ob = ObserverBean()
    ob.property = "1"
    ob.property = "One"
    ob.property = "One"

}