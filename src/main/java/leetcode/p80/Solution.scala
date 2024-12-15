package leetcode.p80

object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length < 3) return nums.length
    var l = 1
    for (r <- 1 until nums.length) {
      if (r > l){
        if (nums(r) != nums(l)) {
          l += 1
          nums(l) = nums(r)
        } else {
          if (nums(r) != nums(l - 1)) {
            l += 1
            nums(l) = nums(r)
          }
        }
      }
    }
    l + 1
  }
}