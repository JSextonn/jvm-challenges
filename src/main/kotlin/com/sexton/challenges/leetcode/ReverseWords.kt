package com.sexton.challenges.leetcode

object ReverseWords {
    fun reverseWords(s: String): String = s.trim().replace("\\s{2,}".toRegex(), " ").split(" ").reversed().joinToString(" ")
}