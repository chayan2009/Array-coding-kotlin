fun main(){
    val str1 = "listen"
    val str2 = "silent"

    //sorting technique

    if (areAnagrams(str1, str2)) {
        println("$str1 and $str2 are anagrams.")
    } else {
        println("$str1 and $str2 are not anagrams.")
    }
    
}

fun areAnagrams(str1:String,str2:String):Boolean{

    if(str1.length!=str2.length){
        return false
    }
    return str1.toCharArray().sorted() == str2.toCharArray().sorted()

}