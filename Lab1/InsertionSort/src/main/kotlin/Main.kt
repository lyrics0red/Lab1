fun <T: Comparable<T>> InsertionSort(arr: MutableList<T>) {
    for (i in 1..(arr.size - 1)) {
        var j = i
        while (j > 0 && arr[j] < arr[j - 1]) {
            val tmp = arr[j]
            arr[j] = arr[j - 1]
            arr[j - 1] = tmp
            j--
        }
    }
}

fun test() {
    val rand = (10..20).random()
    var arr = mutableListOf<Int>()
    for (i in 1..rand) {
        arr.add((1..100).random())
        print("${arr[arr.size - 1]} ")
    }
    println()
    InsertionSort(arr)
    for (i in 0..(arr.size - 1)) {
        print("${arr[i]} ")
    }
}

fun main(args: Array<String>) {
    test()
}