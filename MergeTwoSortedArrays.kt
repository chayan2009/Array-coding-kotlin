fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    return (arr1 + arr2).sortedArray()
}

fun main() {
    val arr1 = intArrayOf(1, 3, 5)
    val arr2 = intArrayOf(2, 4, 6,7,8,9,90,0)
    //approach-1
    println("Merged array: ${mergeSortedArrays(arr1, arr2).joinToString(", ")}") // Output: Merged array: 1, 2, 3, 4, 5, 6
    //approach-2
    var result=twoPointerusingMergeTwoArray(arr1,arr2)
    println("twoPointerusingMergeTwoArray array: ${result.sortedArray().joinToString(", ")}")
}

fun twoPointerusingMergeTwoArray(arr1: IntArray, arr2: IntArray): IntArray {
    var mergeArray= IntArray(arr1.size+arr2.size)
    var i=0
    var j =0
    var k =0
    
    while(i<arr1.size && j<arr2.size){
        if(arr1[i]<=arr2[j]){
            mergeArray[k]=arr1[i]
            i++
        }else{
            mergeArray[k]=arr2[j]
            j++
        }
        k++
    }    

    print(arr1.joinToString(","))
    print(arr2.joinToString(","))

    while(i<arr1.size){
        mergeArray[k]=arr1[i]
        i++
        k++
    }

    while(i<arr2.size){
        mergeArray[k]=arr2[i]
        i++
        k++
    }
    return mergeArray
}
