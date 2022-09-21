fun main() {
    val a = 12;
    val b = 24;

    var str = maxOf1(12, 24)
    var c :String = ""
    c = if (a > b) "a > b" else " a< b"
}

fun maxOf1(a: Int, b: Int): String {
    return if (a > b) {
        "a 大于 b"
    } else {
        "a 小于 b"
    }
}
/// 简写的方式;
fun maxOf2(a: Int, b: Int) = if (a > b) a else b