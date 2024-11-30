package leetcode.problems167

object Solution {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    var left = 0
    var right = numbers.length
    while (left < right) {
      val sum = numbers(left) + numbers(right)
      if (sum == target) {
        return Array(left + 1, right + 1)
      } else if (sum < target) {
        left += 1
      } else {
        right -= 1
      }
    }
    Array()
  }
}