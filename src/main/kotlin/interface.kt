fun main() {

}

interface MyInterface {
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo"
    fun foo()
}

class Child() : MyInterface {
    override val prop: Int = 29
    override fun foo() {
    }
}

interface Named {
    val name: String
}

interface Study : Named {
    val firstName: String
    val lastName: String
//    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // 不必实现“name”
    override val firstName: String,
    override val lastName: String,
    val position: Position,
    override val name: String
) : Study
class  Position {

}