fun main(args: Array<String>) {

    println("")
    val list = listOf(3, 2, 6, 0, 9, -4, 5, 8, 7, 1)
    println(list)
    println("")

    fun printRet(name: String, value: Any?) {
        println("$name = $value")
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //1. 总数操作符
    //1.1 any操作符 只要有一个满足条件的就返回true否则为false
    val retAny = list.any { it > 5 }
    printRet("retAny", retAny)

    //1.2 all操作符 所有元素均满足条件才返回true，否则返回false
    val retAll = list.all { it > 5 }
    printRet("retAll", retAll)

    //1.3 count操作符 返回满足条件的元素个数
    val retCount = list.count { it > 5 }
    printRet("retCount", retCount)

    //1.4 fold操作符 初始化一个值，在此基础上计算各元素累加和
    val retFold = list.fold(0) { total, next -> total + next }
    printRet("retFold", retFold)

    //1.5 foldRight操作符 初始化一个值，在此基础上从右到左计算各元素累加和
    val retFoldRight = list.foldRight(0) { total, next -> total + next }
    printRet("retFoldRight", retFoldRight)

    //1.6 forEach 遍历各元素
    list.forEach { println(it) }


    //1.7 forEachRight 从右向左遍历各元素
    list.forEachIndexed { index, i -> println("index = $index, i = $i") }

    //1.8 max 找出最大值
    val retMax = list.max()
    printRet("retMax", retMax)

    //1.9 maxBy 按表达式计算后的最大值的元素
    val retMaxBy = list.maxBy { -it }
    printRet("retMaxBy", retMaxBy)

    //1.10 min 找出最小值
    val retMin = list.min()
    printRet("retMin", retMin)

    //1.11 minBy 按表达式计算后的最小值的元素
    val retMinBy = list.minBy { -it }
    printRet("retMinBy", retMinBy)

    //1.12 none
    val retNone = list.none { it % 11 == 0 }
    printRet("retNone", retNone)

    //1.12 reduce
    val retReduce = list.reduce { total, next -> total + next }
    printRet("retReduce", retReduce)

    //1.13 reduceRight
    val retReduceRight = list.reduceRight { total, next -> total + next }
    printRet("retReduceRight", retReduceRight)

    //1.14 sum
    val retSum = list.sum()
    printRet("retSum", retSum)

    //1.15 sumBy
    val retSumBy = list.sumBy { it * 10 }
    printRet("retSumBy", retSumBy)


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //2. 过滤操作符
    //2.1 drop
    val retDrop = list.drop(4)
    printRet("retDrop", retDrop)

    //2.2 dropWhile 返回第一个不满足条件之后所有数
    val retDropWhile = list.dropWhile { it < 9 }
    printRet("retDropWhile", retDropWhile)

    //2.3 dropLastWhile 返回第一个不满足条件之前所有数
    val retDropLastWhile = list.dropLastWhile { it < 9 }
    printRet("retDropLastWhile", retDropLastWhile)

    //2.4 filter
    val retFilter = list.filter { it < 0 }
    printRet("retFilter", retFilter)

    //2.5 filterNot
    val retFilterNot = list.filterNot { it < 0 }
    printRet("retFilterNot", retFilterNot)

    //2.6 filterNotNull
    val retFilterNotNull = listOf("A", "B", null, "D").filterNotNull()
    printRet("retFilterNotNull", retFilterNotNull)

    //2.7 slice 返回指定index的元素
    val retSlice = list.slice(listOf(1, 3, 5, 7))
    printRet("retSlice", retSlice)

    //2.8 take
    val retTake = list.take(2)
    printRet("retTake", retTake)

    //2.9 takeLast
    val retTakeLast = list.takeLast(2)
    printRet("retTakeLast", retTakeLast)

    //2.9 takeWhile 从第一个元素开始符合给定函数条件的所有元
    val retTakeWhile = list.takeWhile { it < 4 }
    printRet("retTakeWhile", retTakeWhile)

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //3. 映射操作符
    //3.1 flatMap
    val retFlatMap = list.flatMap { listOf(it, it * 10) }
    printRet("retFlatMap", retFlatMap)

    //3.2 groupBy
    val retGroupBy = list.groupBy { it < 0 }
    printRet("retGroupBy", retGroupBy)

    //3.3 map
    val retMap = list.map { it * 10 }
    printRet("retMap", retMap)

    //3.4 mapIndexed
    val retMapIndexed = list.mapIndexed { index, it -> index * it }
    printRet("retMapIndexed", retMapIndexed)

    //3.5 mapNotNull
    val retMapNotNull = list.mapNotNull { it * 10 }
    printRet("retMapNotNull", retMapNotNull)


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //4. 生产操作符
    //4.1 partition
    val retPartition = list.partition { it < 0 }
    printRet("retPartition", retPartition)

    //4.2 plus
    val retPlus = list.plus(listOf(10, 20))
    printRet("retPlus", retPlus)

    //4.3 zip
    val retZip = list.zip(listOf(10, 20, 30))
    printRet("retZip", retZip)

    //4.4 unzip
    val retUnzip = listOf(Pair(10, 20), Pair(1, 2)).unzip()
    printRet("retUnzip", retUnzip)


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //5. 顺序操作符
    //5.1 reversed
    val retReversed = list.reversed()
    printRet("retReversed", retReversed)

    //5.2 sort
    val retSorted = list.sorted()
    printRet("retSorted", retSorted)

    //5.3 sortBy
    val retSortBy = list.sortedBy { it % 3 }
    printRet("retSortBy", retSortBy)

    //5.4 sortedDescending
    val retSortedDescending = list.sortedDescending()
    printRet("retSortedDescending", retSortedDescending)

    //5.5 sortedByDescending
    val retSortedByDescending = list.sortedByDescending { it * 10 }
    printRet("retSortedByDescending", retSortedByDescending)

}