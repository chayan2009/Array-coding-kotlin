fun main(){
    var arrays=intArrayOf(110,23,34,53,56,24,222,3)

    //sum fo the array
    var sum=sumOfArrays(arrays)
    println("sum of the Array:$sum")

    //Average fo the array
    var average=averageOfTheArray(arrays)
    println("Average fo the array:$average")

}

fun sumOfArrays(arr:IntArray):Int{

    var sum=0
    for(i in arr){
        sum = sum+i
    }

    return sum
   // return arr.sum()
}

fun averageOfTheArray(arr:IntArray):Int{

    var average = 0
    var sum = 0
    for(i in arr){
        sum = sum+i
    }
    average=sum/arr.size
    return average
    //return arr.average().toInt()
}