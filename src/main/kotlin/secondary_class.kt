fun main() {
//    val p = Person(userAge = 1)
    Person("name")
//    val p = Person()
}

class Person constructor(val userName : String , val userAge : Int) {
    init {
    println("init:----")
    }

    constructor(userAge : Int) : this("暂无姓名" , userAge) {
        println("constructor:userAge")
    }

    constructor(userName: String): this(userName,2) {
        println("constructor:userName")
    }
}