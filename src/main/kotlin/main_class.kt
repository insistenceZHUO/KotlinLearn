fun main() {
    var i = InitOrderDemo("InitOrderDemo")
}

class Empty;

private class InitOrderDemo(var name: String) {
    private var firstProperty = "First property: $name".also(::println)
    var secondProperty = "Second property: ${name.length}".also(::println)

    init {
        this.firstProperty = name;
        this.name = "22"

        this.secondProperty = "今晚大老虎";
        println("First initializer block that prints $name")
    }

    init {
        println("Second initializer block that prints ${name.length}")
    }
}