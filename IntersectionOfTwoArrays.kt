fun main(){
    println("Find the Intersection of Two Arrays")
    var array1=intArrayOf(1,2,3,5)
    var array2=intArrayOf(1,3,7,8,9,9)
    val result =checkIntersectionInTwoArray(array1,array2)
    println("Find the Intersection of Two Arrays:: ${result.joinToString(",")}")
}

fun checkIntersectionInTwoArray(arr:IntArray,arr2:IntArray):IntArray{
        return arr.intersect(arr2.toSet()).toIntArray()
}