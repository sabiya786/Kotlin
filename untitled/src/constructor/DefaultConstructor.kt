package constructor

class DefaultConstructor() {

    fun default()
    {
        println("default constructor")
    }
}

fun main()
{
    val obj = DefaultConstructor()
    obj.default()
}