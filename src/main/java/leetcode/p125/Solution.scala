package leetcode.p125

object Solution {
  def isPalindrome(s: String): Boolean = {
    var i = 0
    var j = s.length - 1
    while (i < j) {
      if (!s(i).isLetterOrDigit) {
        i += 1
      } else if (!s(j).isLetterOrDigit) {
        j -= 1
      } else {
        if (s(i).toLower != s(j).toLower) {
          return false
        }
        i += 1
        j -= 1
      }
    }
    true
  }
}