fun main() {
    
    var array=intArrayOf(10,20,32,45,78,232,892)
    var maxNumber=findMaxElementFromArray(array)
    println("maximum element in an Array::  $maxNumber")
    var minNumber=findMinElementFromArray(array)
    println("Minimum element in an Array::  $minNumber")
}

   fun findMinElementFromArray(arr:IntArray):Int{

    var minimum=arr[0]
    for(i in arr){
        if(i<minimum){
            minimum=i
        }
    }
    return minimum

   }


   fun findMaxElementFromArray(arr:IntArray):Int{

     var maximum= arr[0]

     for(i in arr){
        if(i>maximum)
        maximum=i
     }
     return maximum

    }