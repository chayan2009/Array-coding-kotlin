 fun main() {
    print("Check if Two Arrays are Equal")
    var array1=intArrayOf(1,2,3,4)
    var array2=intArrayOf(1,2,3,4,5)
    println("Are equal : ${areArraysEqual(array1,array2)}")
}

fun areArraysEqual(array1:IntArray,array2:IntArray):Boolean{
    return array1.contentEquals(array2)
}