/// 对象表达式;
fun main() {
    val helloWorld = object {
        val hello = "hello";
        val world = "world"
        override fun toString() = "${hello}:${world}"
    }
    val ab: B = object : A(1), B {
        override var y = 15
    }

    println("ab.y:${ab}")
    var c = C();
//    c.getObject()
}

open class A(x: Int) {
    public open val y: Int = x
}

interface B { /*……*/ }

class C {
    private fun getObject() = object {
        val x: String = "x"
    }

    fun printX() {
        println(getObject().x)
    }
}


