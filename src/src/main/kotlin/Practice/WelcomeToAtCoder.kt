fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }.first()
    val (b,c) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine() ?: ""
    println((a + b + c).toString() + " " + s)
}