fun main(){

    println("Check if an Array is Sorted ")
    var array1=intArrayOf(5, 4, 3, 2, 1)
    var array2=intArrayOf(1,2,3,4,5,6)
    val result=isSortedAscending(array1)
    println("Is Soreted in AssendingOrder:: ${result}")
    val result1=isSortedDescending(array2)
    println("Is Soreted in Dessendingorder:: ${result1}")
    print("is Sorted or not?:: ${isSorted(array2)}")
}

fun isSorted(arr: IntArray): Boolean {
    return isSortedAscending(arr) || isSortedDescending(arr)
}
fun isSortedAscending(arr: IntArray): Boolean {
    for (i in 0 until arr.size - 1) {
        if (arr[i] > arr[i + 1]) {
            return false
        }
    }
    return true
}

 fun isSortedDescending(arr: IntArray): Boolean {
        for (i in 0 until arr.size - 1) {
            if (arr[i] < arr[i + 1]) {
                return false
            }
        }
        return true
    }