package leetcode.p88

/**
 *
 * @author Z
 * @since 2024/12/8 下午3:10
 */
object Main {

  def main(args: Array[String]): Unit = {
    val nums1 = Array(4, 5, 6, 0, 0, 0)
    Solution.merge(nums1, 3, Array(1, 2, 3), 3)
    println(nums1.mkString("Array(", ", ", ")"))
  }

}
