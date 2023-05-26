//https://leetcode.com/problems/median-of-two-sorted-arrays/


fun main(){

    val arr1 = intArrayOf(1,2)

    val arr2 = intArrayOf(3, 4)
    println(findMedianSortedArrays(arr1, arr2))

}


fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val arr = nums1 + nums2
    arr.sort()
    return if (arr.size and 1 == 1){
        arr[arr.size / 2].toDouble()
    }else{
        (arr[arr.size / 2 - 1].toDouble() + arr[arr.size / 2])  / 2
    }
}