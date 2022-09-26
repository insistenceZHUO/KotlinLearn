import kotlin.math.log

fun main() {

    var address = Address();

    println("address.stringRepresentation:${address.stringRepresentation}")
    println("address.counter:${address.counter}")
    address.counter = -1
    println("address.counter:${address.counter}")
}

class Address {
    /// 声明属性;
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    var counter = 0
        get() = field + 2// 这个初始器直接为幕后字段赋值
        set(value) {
            if (value >= 0)
                field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
        }

    var stringRepresentation: String
        /// 定义
        get() {
            println("get:")
            return "123"
        }
        set(value) {

        }


    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // 类型参数已推断出
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }
}


const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"



fun copyAddress(address: Address): Address {
    val result = Address() // Kotlin 中没有“new”关键字
    result.name = address.name // 将调用访问器
    result.street = address.street
    return result
}

open class  TestSubject {}
public class MyTest {
    lateinit var subject: TestSubject

//    @SetUp fun setup() {
//        subject = TestSubject()
//    }
//
//    @Test fun test() {
//        subject.method()  // 直接解引用
//    }
}