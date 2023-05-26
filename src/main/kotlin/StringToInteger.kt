fun main() {

    println(myAtoi("     -42"))
}

//Dumb problem, too many unexplained testcases. Moved on to something else
fun myAtoi(s: String): Int {

    var isNegative = false
    val map: HashMap<String, Int> =
        hashMapOf("1" to 1, "2" to 2, "3" to 3, "4" to 4, "5" to 5, "6" to 6, "7" to 7, "8" to 8, "9" to 9, "0" to 0)
    var number = ""
    var text = s
    var temp = ""



    text = text.replace(" ", "")

    for (i in text.indices){
        if (!map.keys.contains(text[i].toString())){
            return 0
        }
    }

    if (text.first() == '-') {
        isNegative = true
        text = text.replace("-", "")
        if (!map.keys.contains(text.first().toString())){
            return 0
        }
    } else if (text.first() == '+') {
        isNegative = false
        text = text.replace("+", "")
        if (!map.keys.contains(text.first().toString())){
            return 0
        }
    }else if (!map.keys.contains(text.first().toString())){
        return 0
    }
    for (i in text.indices) {
        temp += text[i]

        for (k in map.keys) {
            if (temp == k) {
                number += k
                temp = ""
                break
            }
        }
        if (temp.isNotEmpty()) break
    }
    if (number.toLong() > Int.MAX_VALUE && isNegative){
        number = Int.MIN_VALUE.toString()
    }else if (number.toLong() > Int.MAX_VALUE && !isNegative){
        number = Int.MAX_VALUE.toString()
    }
    return if (isNegative) number.toInt() * -1 else number.toInt()
}