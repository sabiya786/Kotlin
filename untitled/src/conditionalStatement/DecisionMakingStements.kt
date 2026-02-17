package conditionalStatement

fun decisionMakeing()
{
    var a=20

    if(a!=20)
    {
        println("true")
    }
    else
    {
        println("false")
    }


    when(a)
    {
        1 -> println("true $a")
        2 -> println("true $a")
        3 -> println("true $a")
        4 -> println("true $a")
        5 -> println("true $a")
        20 -> println("true $a")
        else -> println("false")

    }
}


fun main()
{
    decisionMakeing()
}