package variable

fun lateInitFunction()
{
    lateinit var a:String
    a ="Hello"
    println(a)
}

fun main()
{
    lateInitFunction()
}