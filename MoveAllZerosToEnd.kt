fun moveZerosToEnd(arr: IntArray) {
    var nonZeroIndex = 0 
    for (i in arr.indices) {
        if (arr[i] != 0) {
            arr[nonZeroIndex] = arr[i]
            nonZeroIndex++
        }
    }

    for (i in nonZeroIndex until arr.size) {
        arr[i] = 0
    }
}

fun main() {
    val arr = intArrayOf(0, 1, 0, 3, 12,5445,0,0,21,54,4,0,7,9)
    moveZerosToEnd(arr)
    println(arr.joinToString()) // Output: 1, 3, 12, 0, 0
}
