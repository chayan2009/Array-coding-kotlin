fun main(){
    println("Find the Maximum Product of Two Elements")
    var arr = intArrayOf(1,2,22,4,44,5,55,56,76,777,888,23)
    println(maxProductOfTwoElements(arr))  
}

fun maxProductOfTwoElements(arr:IntArray):Int{
    var max1=Int.MIN_VALUE
    var max2=Int.MIN_VALUE

    for(num in arr){
        if(num>max1){
            max2=max1
            max1=num
        }else if(num>max2){
            max2=num
        }
        
    }
    return max1*max2
}