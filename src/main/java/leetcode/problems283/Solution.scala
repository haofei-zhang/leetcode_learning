package leetcode.problems283

object Solution {
  def moveZeroes(nums: Array[Int]): Unit = {
    var left = 0
    for (right <- nums.indices) {
      if (nums(right) != 0) {
        while (left < right && nums(left) != 0) left += 1
        if (left < right) {
          nums(left) = nums(right)
          nums(right) = 0
          left += 1
        }
      }
    }
  }
}