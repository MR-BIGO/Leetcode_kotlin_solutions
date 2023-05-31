package easy

fun main(){
    println(strStr("leetcode", "leeto"))

}

fun strStr(haystack: String, needle: String): Int {

    for (i in haystack.indices){
        if (haystack.length - needle.length < i){
            return -1
        }
        if (haystack.substring(i, i + needle.length) == needle){
            return i
        }
    }
    return -1
}
