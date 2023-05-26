
//https://leetcode.com/problems/two-sum/

import java.util.Arrays

fun main() {

    val arr: IntArray = intArrayOf(3,3)
    println(Arrays.toString(twoSum(arr, 6)))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val arr = IntArray(2) {-1}
    for(i in nums.indices){
        for(j in nums.indices){
            if(i != j){
                if(nums[i] + nums[j] == target){
                    arr[0] = i
                    arr[1] = j
                    break
                }
            }
        }
        if (arr[0] != -1) break

    }
    return arr
}