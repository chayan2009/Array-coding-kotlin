fun main(){
    println("Rotate an Array by k Positions")
    var array=intArrayOf(1,2,4,6,7,22,21,4,9,0,100)
    var k=5
    var result=rotateArray(array,k)
    println(result.joinToString(", "))
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