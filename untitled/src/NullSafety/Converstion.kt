package NullSafety

fun main()
{
    var name:String?=null

    var b = name as? Int

    println(b)
}