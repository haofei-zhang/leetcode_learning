package leetcode.p189

import scala.util.control.Breaks.break

object Solution {
  def rotate(nums: Array[Int], k: Int): Unit = {
    val k1 = k % nums.length

    if (k1 == 0){
      return
    }

    val sub = nums.slice(nums.length - k1, nums.length)

    var i = nums.length-1
    while (i >= k1){
      nums(i) = nums(i - k1)
      i -= 1
    }

    var j = 0
    while (j < k1){
      nums(j) = sub(j)
      j += 1
    }

  }
}