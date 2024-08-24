fun main(){

    var array=intArrayOf(1,5,4,6,7,8,22)
    // approach-1
   var reverseArray=array.reversedArray()
   println("Reversed: ${reverseArray.joinToString(", ")}") 

    // appraoch-2
    for(i in array.size-1 downTo 0 ){
        println(array[i])
    }
}