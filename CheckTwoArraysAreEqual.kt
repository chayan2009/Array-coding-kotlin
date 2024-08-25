 fun main() {
    var array1=intArrayOf(1,2,3,4)
    var array2=intArrayOf(1,2,3,4)

    //Apprach1
    println("Are equal : ${areArraysEqual(array1,array2)}")

    //Approach2
  //  println("Are equal loop : ${areArraysEqual1(array1,array2)}")

}

fun areArraysEqual1(array1:IntArray,array2:IntArray):Boolean{
    var flag=false
    if(array1.size==array2.size){
        for(i in array1){
            for(j in array2){
                if(i==j){
                    flag=true
                }
            }
        }
    }else{
        flag=false
    }
   
    return flag
}

fun areArraysEqual(array1:IntArray,array2:IntArray):Boolean{
    return array1.contentEquals(array2)
}