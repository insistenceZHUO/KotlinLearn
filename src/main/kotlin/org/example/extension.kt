package org.example

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)

    printClassName(Children())// “swap()”内部的“this”会保存“list”的值
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

open class Parent;

class Children : Parent() {

}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun Parent.getName() = "parent";
fun Children.getName() = "children";

fun printClassName(s: Parent) {
    println(s.getName())
}
