package com.sexton.challenges.leetcode

object SingleNumber {
    fun singleNumber(numbers: IntArray): Int = numbers.groupBy { it }.entries.first { it.value.size == 1 }.key
}