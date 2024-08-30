fun main(){
    println("Rotate an Array by k Positions")
    var array=intArrayOf(1,2,4,6,7,22,21,4,9,0,100)
    var k=5
    //approach-1
    var result=rotateArray(array,k)
   println(result.joinToString(", "))
 //approach-2

   rotateArrayInPlace(array,k)
}

fun rotateArrayInPlace(arr:IntArray,k:Int){
 var n=arr.size
 var rotatePos=k%n
 //Reverse the entire array
 reverse(arr, 0, n-1)
// Reverse the first k elements
 reverse(arr, 0, rotatePos-1)
 //Reverse the remaining n-k elements
 reverse(arr, rotatePos-1, n-1)
 println(arr.joinToString(", ")) 

}
fun reverse(arr:IntArray,start:Int,end:Int){

    var i=start
    var j=end
    while(i < j){
        var temp= arr[i]
        arr[i]=arr[j]
        arr[j]=temp
        i++
        j--
    }

}

fun rotateArray(arr:IntArray,k:Int):IntArray{

    var n=arr.size
    var rotatedArray=IntArray(n)
    var rotatedPos=k%n
    for(i in arr.indices){
        rotatedArray[(i+rotatedPos)%n] = arr[i]
    }
    return rotatedArray
}