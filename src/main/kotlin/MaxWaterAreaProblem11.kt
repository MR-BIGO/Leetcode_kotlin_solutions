
//https://leetcode.com/problems/container-with-most-water/

fun main(){

    val arr: IntArray = intArrayOf(1,8,6,2,5,4,8,3,7)
    println(maxArea(arr))

}

fun maxArea(height: IntArray): Int {
    var area = 0
    var tempArea: Int
    var i = 0
    var j = height.size - 1

    while (true){
        if (i == j){
            break
        }
        tempArea = if (height[i] <= height[j]){
            height[i] * (j - i)
        }else{
            height[j] * (j - i)
        }
        if (tempArea > area) {
            area = tempArea

        }

        if (height[i] > height[j]){
            j--
        }else if(height[i] < height[j]){
            i++
        }else{
            if (height[i + 1] > height[i]){
                i++
                continue
            }else if(height[j - 1] > height[j]){
                j--
                continue
            }else if(height[i + 1] > height[j - 1]){
                i++
            }else{
                j--
            }
        }
    }
    return area
}
