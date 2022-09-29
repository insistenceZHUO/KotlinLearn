/// 数据类;
fun main() {
    var _user = User("", 18)
    var _user2 = _user.copy("12", 2)
    println("_user.equals():${_user.equals()}")
    _user.component1("12")
    _user.component2(2)

    //sampleStart
    val person1 = Person2("John")
    val person2 = Person2("John")
    person1.age = 10
    person2.age = 20
//sampleEnd
    println("person1 == person2: ${person1 == person2}")
    println("person1 with age ${person1.age}: ${person1}")
    println("person2 with age ${person2.age}: ${person2}")
}
open class UserParent {
//    open fun component1() {}
    open fun copy (){}
}

data class User(val name: String, val age: Int): UserParent() {
    fun component1(s: String) {
    }

     fun equals() {
         println("ssss")
     }

    fun component2(i: Int) {
    }
}
data class Person2(val name: String) {
    var age: Int = 0
}