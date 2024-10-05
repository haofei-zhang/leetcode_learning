package leetcode.problems3

import scala.collection.mutable

object Solution {
  def lengthOfLongestSubstring(s: String): Int = {
    var answer: Int = 0
    val map: mutable.HashMap[Char, Int] = mutable.HashMap[Char, Int]()
    var start: Int = 0
    for (i <- 0 until s.length) {
      val char = s.charAt(i)
      if (map.contains(char)) {
        answer = Math.max(answer, i - start)
        start = Math.max(start, map(char) + 1)
        map.put(char, i)
      } else {
        map.put(char, i)
      }
    }
    answer = Math.max(answer, s.length - start)
    answer
  }
}