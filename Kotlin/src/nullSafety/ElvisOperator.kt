package nullSafety

fun main()
{
    var name:String? = null

    println(name?.length)

    var a = name?.length?:2

    println(a)
}