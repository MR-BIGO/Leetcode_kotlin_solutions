package hard

fun main(){
    val arr = intArrayOf()
    println(firstMissingPositive(arr))
}


fun firstMissingPositive(nums: IntArray): Int {


    val arr = nums.filter { it > 0 }.distinct().sorted()
    if (arr.isEmpty()) return 1
    var i = 1
    while (i <= arr.size){
        if (i < arr[i - 1]){
            return i
        }
        i++
    }
    return arr.last() + 1
}