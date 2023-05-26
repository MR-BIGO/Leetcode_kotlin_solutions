
//https://leetcode.com/problems/palindrome-number/

fun main(){

    println(isPalindrome(10))

}

fun isPalindrome(x: Int): Boolean {
    var number = x
    var reversed = 0
    if (x == 0) return true
    if (x > 0){
        while (number != 0){
            val digit: Int = number % 10
            reversed = reversed * 10 + digit
            number /= 10
        }
    } else return false

    return x == reversed
}