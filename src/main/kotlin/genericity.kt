/// 泛型;
fun main(){
    var box= Box<Int>(1);
    
}
class Box<T>(t: T) {
    var value = t
}