fun main(){
    val str1 = "listen"
    val str2 = "silent"

    //sorting technique

    if (areAnagrams(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }

    // array based counting

    if (arrayArrAnangramtechniq(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }

    // map frequency
    
    if (mapFrequencyArrAnangramtechniq(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }
}

fun mapFrequencyArrAnangramtechniq(str1:String,str2:String):Boolean{
    if (str1.length != str2.length) return false

    var frequencyMap = mutableMapOf<Char, Int>()

    // Count characters in str1
    for (char in str1) {
        frequencyMap[char] = frequencyMap.getOrDefault(char, 0) + 1
    }

    // Subtract character counts based on str2
    for (char in str2) {
        frequencyMap[char] = frequencyMap.getOrDefault(char, 0) - 1
        if (frequencyMap[char] == 0) {
            frequencyMap.remove(char)
        }
    }

    // If the map is empty, the strings are anagrams
    return frequencyMap.isEmpty()
}

fun arrayArrAnangramtechniq(str1:String,str2:String):Boolean{
    if(str1.length!=str2.length){
        return false
    }
    var charCount = IntArray(26)
    for(i in str1.indices){
        charCount[str1[i]-'a']++
        charCount[str2[i]-'a']--
    }
    return charCount.all { it==0 }
}

fun areAnagrams(str1:String,str2:String):Boolean{

    if(str1.length!=str2.length){
        return false
    }
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()

}