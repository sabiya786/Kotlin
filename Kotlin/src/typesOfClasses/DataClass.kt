package typesOfClasses

data class DataClass(var a:Int, var b:Int)
{

    fun data()
    {
        println(a+b)

    }

}

fun main()
{
    val obj = DataClass(10,30)
    obj.data()
}