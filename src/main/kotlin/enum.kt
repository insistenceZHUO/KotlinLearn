fun main() {
    println("<top>.main:${Direction.EAST.test}")
}

//enum class Direction(i: Int) {
//    NORTH(), SOUTH(), WEST(), EAST(),
//}
enum class Direction(val test: Int) {
    NORTH(1), SOUTH(2), WEST(3), EAST(9),
}