package leetcode.p169

object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    nums.sortInPlace()
    nums(nums.length / 2)
  }
}