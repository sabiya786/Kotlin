package conditionalStatement

fun loops()
{
    for(i in 1..8)
    {
        println(i)
    }

    var a=20
    while (a<=30)
    {
        println(a)
        a++
    }

    do {
        println(a)
        a++
    }while (a<=55)
}


fun main()
{
    loops()
}