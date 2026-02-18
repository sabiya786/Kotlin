package nullSafety


fun main()
{
    var name:String? =null

    name.let {
        println(name)
    }
}