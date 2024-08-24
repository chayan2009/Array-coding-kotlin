fun main(){
    
    //Find the Frequency of an Element from the Array

    var array = intArrayOf(1,2,3,4,1,5,65,2,3,5,6,7,9,0,0,1,3)

    var hashMap:HashMap<Int,Int> = HashMap<Int,Int>()

    for(i in array){
        hashMap[i]=hashMap.getOrDefault(i,0)+1
    }
    println("hashmap::$hashMap")
}