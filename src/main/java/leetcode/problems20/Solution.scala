package leetcode.problems20

import scala.collection.mutable

object Solution {
  def isValid(s: String): Boolean = {
    val open: Array[Char] = Array('(', '[', '{')
    val close: Array[Char] = Array(')', ']', '}')


    val stack = new mutable.Stack[Char](s.length)
    var result = true
    for (c <- s.toCharArray) {
      if (open.contains(c)) stack.push(c)

      if (close.contains(c)) {
        if (stack.isEmpty) result = false
        else if (stack.pop != open(close.indexOf(c))) result = false
      }

    }
    result && stack.isEmpty
  }
}