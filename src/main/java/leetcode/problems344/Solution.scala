package leetcode.problems344

object Solution {
  def reverseString(s: Array[Char]): Unit = {
    var i = 0
    var j = s.length - 1
    while(i < j){
      val temp = s(i)
      s(i) = s(j)
      s(j) = temp
      i += 1
      j -= 1
    }
  }
}