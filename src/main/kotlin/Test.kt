fun main() {
    val num = intArrayOf(1,5,3,7,-4)

    val sum = arrayOf(num.filter { it>0 })
    println(num.filter { it>0 }.sum())
}