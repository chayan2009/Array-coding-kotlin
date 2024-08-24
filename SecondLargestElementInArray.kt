fun main(){
    //Find the Second Largest Element

    var array=intArrayOf(1,2,3,5,6,88,22,77,544,23,33334)
    val secondLargest=findSecondLargestElementInAnArray(array)
    println("Find the Second Largest Element:: $secondLargest")
}

fun findSecondLargestElementInAnArray(arr:IntArray):Int{
    val sortedArray=arr.distinct().sortedDescending()
    if(sortedArray.size>2){
        return sortedArray[1]
    }else{
        return -1
    }
}