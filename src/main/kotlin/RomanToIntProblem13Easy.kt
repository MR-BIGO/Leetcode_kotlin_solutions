fun main(){
    println(romanToInt("XIV"))

}

fun romanToInt(s: String): Int {
    val map = hashMapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var res = 0

    for (i in s.indices){
        if (s.lastIndex != i){
            if (map.getValue(s[i]) < map.getValue(s[i+1])){
                res -= map.getValue(s[i])
            }else{
                res += map.getValue(s[i])
            }
        }else{
            res += map.getValue(s[i])
        }
    }
    return res
}