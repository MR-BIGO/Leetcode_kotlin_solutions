fun main() {

    println(myAtoi2("words and 987"))
}

//Dumb problem, too many unexplained testcases. Moved on to something else
fun myAtoi2(s: String): Int {

    var isNegative = false
    var firstCheck = false
    var isFinished = false
    val map: HashMap<String, Int> =
        hashMapOf("1" to 1, "2" to 2, "3" to 3, "4" to 4, "5" to 5, "6" to 6, "7" to 7, "8" to 8, "9" to 9, "0" to 0)
    var number = ""
    var text = s
    var temp = ""
    if (text.contains('-')){
        text = text.removeRange(0 .. text.indexOf('-'))
        isNegative = true
        firstCheck = true
    }else if (text.contains("+")){
        text = text.removeRange(0 .. text.indexOf("+"))
        firstCheck = true
    }
    if(!firstCheck){
        for (i in text.indices){
            temp += text[i]
            for (k in map.keys){
                if (temp == k){
                    text = text.removeRange(0 until i)
                    isFinished = true
                }
            }
            temp = ""
            if (isFinished) break

        }
    }
    for (i in text.indices){
        temp += text[i]

        for (k in map.keys){
            if (temp == k){
                number += k
                temp = ""
                break
            }
        }
        if (temp.isNotEmpty()) break
    }

    return if(isNegative) number.toInt() * -1 else number.toInt()
}