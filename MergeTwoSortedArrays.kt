fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    return (arr1 + arr2).sortedArray()
}

fun main() {
    val arr1 = intArrayOf(1, 3, 5)
    val arr2 = intArrayOf(2, 4, 6)
    println("Merged array: ${mergeSortedArrays(arr1, arr2).joinToString(", ")}") // Output: Merged array: 1, 2, 3, 4, 5, 6
}
