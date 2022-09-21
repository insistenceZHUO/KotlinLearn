fun main(args: Array<String>) {
    var s = sum(1, 3)
    println("s:$s")
}

/// 定义一个函数;
fun sum(a: Int, b: Int): Int {
    return a + b
}

/// 将表达式作为函数体;
fun sum1(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}