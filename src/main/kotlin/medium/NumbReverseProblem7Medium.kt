package medium//https://leetcode.com/problems/reverse-integer/

fun main(){

    println(reverse(1534236469))
}

fun reverse(x: Int): Int {
    var number = x
    var reversed = 0
    var isNegative = false
    if (number < 0){
        number *= -1
        isNegative = true
    }
    while (number > 0){
        val digit = number % 10

        if (reversed > (Int.MAX_VALUE - digit) / 10) return 0
        reversed = reversed * 10 + digit
        number /= 10
    }
    if (isNegative) reversed *= -1

    return reversed
}
