
/// 顶层变量;
const val PI = 3.14
var x = 0
fun main () {
    val a: Int = 1  // 立即赋值
    val b = 2   // 自动推断出 `Int` 类型
    val c: Int  // 如果没有初始值类型不能省略
    c = 3       // 明确赋值
    var x = 5 // 自动推断出 `Int` 类型
    x += 1
    println("x:${x}")
    println("Pi:${PI}")
}