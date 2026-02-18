package constructor

class UserDefineConstructor()
{
    var a:Int=90
    constructor( b:Int) : this() {
       var b:Int = this.a
        println(b)
    }

}

fun main()
{
    val obj =UserDefineConstructor(99)

}