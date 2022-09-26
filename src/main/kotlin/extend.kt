open class Base(age: Int) {
}

class Derived : Base {
    constructor(p: Int) : super(p)
}

/// 覆盖方法;

open class Shape {
    /// 覆盖属性;
    open val vertexCount: Int = 0

    /// 覆盖方法;
    open fun draw() { /*……*/
    }

    fun fill() { /*……*/
    }
}


class Circle() : Shape() {
    override val vertexCount: Int = 22
    override fun draw() {
        super.draw()
    }
}

open class Rectangle {
    open fun draw() { /* …… */ }
}

interface Polygon {
    fun draw() { /* …… */ } // 接口成员默认就是“open”的
}

class Square() : Rectangle(), Polygon {
    // 编译器要求覆盖 draw()：
     override fun draw() {
        super<Rectangle>.draw() // 调用 Rectangle.draw()
        super<Polygon>.draw() // 调用 Polygon.draw()
    }

}