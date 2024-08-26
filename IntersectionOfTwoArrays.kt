fun main(){
    println("Find the Intersection of Two Arrays")
    var array1=intArrayOf(1,2,3,5)
    var array2=intArrayOf(1,3,7,8,9,9)
    //approeach 1
    val result =checkIntersectionInTwoArray(array1,array2)
    println("Find the Intersection of Two Arrays:: ${result.joinToString(",")}")

     //approeach -2
    val result1=checkIntersectionInTwoArrayusingiterrative(array1, array2)
    println("Find the Intersection of Two Arrays:: ${result1.joinToString(",")}")

    }

    fun checkIntersectionInTwoArrayusingiterrative(arr:IntArray,arr1:IntArray):IntArray{

        var reusltArray=mutableListOf<Int>()
        for(i in arr.indices){
            for(j in arr1.indices){
                if(arr[i]==arr1[j]){
                    reusltArray.add(arr[i])
                }
            }
        }
        return reusltArray.toIntArray()

    }
fun checkIntersectionInTwoArray(arr:IntArray,arr2:IntArray):IntArray{
        return arr.intersect(arr2.toSet()).toIntArray()
}