fun main(){
    val arr = intArrayOf(1,3,5,6)
    println(searchInsert(arr, 7))
}

fun searchInsert(nums: IntArray, target: Int): Int {

    if (nums.contains(target)) return nums.indexOf(target)

    if (nums.last() < target){
        return nums.lastIndex + 1
    }else{
        for (i in nums.indices){
            if (target < nums[i]) return i
        }
    }
    return 0
}