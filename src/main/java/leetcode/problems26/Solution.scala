package leetcode.problems26

object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    var i = 0
    for (j <- 1 until nums.length) {
      if (nums(i) != nums(j)) {
        i += 1
        nums(i) = nums(j)
      }
    }
    i+1
  }
}