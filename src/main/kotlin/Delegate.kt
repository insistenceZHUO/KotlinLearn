interface Base1 {
    val message: String
    fun print()
}

class BaseImpl(val x: Int) : Base1 {
    override val message = "BaseImpl: x = $x"
    override fun print() { println(message) }
}

class Derived1(b: Base1) : Base1 by b {
    // 在 b 的 `print` 实现中不会访问到这个属性
    override val message = "Message of Derived"
}

fun main() {
    val b = BaseImpl(10)
    val derived = Derived1(b)
    derived.print()
    println(derived.message)
}
