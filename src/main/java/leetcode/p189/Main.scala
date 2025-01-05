package leetcode.p189

import leetcode.p189.Solution.rotate

/**
 *
 * @author Z
 * @since 2025/1/5 下午6:01
 */
object Main {

  def main(args: Array[String]): Unit = {
    val nums = Array(1, 2, 3, 4, 5, 6, 7)
    rotate(nums, 3)
    println(nums.mkString(","))
  }

}
