package com.wmhxx.leetcode.simple;


/**
 * LeetCode 747
 *
 * @author wmhxx
 * @date 2022/01/14 01:00:26
 */
public class LeetCode747 {

    /**
     * 给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
     * <p>
     * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] ints = {0, 0, 3, 2, 4, 3, 5, 8, 3, 6, 7};
        int i = new LeetCode747().dominantIndex(ints);
        System.out.println("i====" + i);
    }


    public int dominantIndex(int[] nums) {
        int maxOne = 0, maxTow = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxOne < nums[i]) {
                maxTow = maxOne;
                maxOne = nums[i];
                index = i;
            } else if (maxTow < nums[i]) {
                maxTow = nums[i];
            }
        }
        return maxOne >= (maxTow * 2) ? index : -1;
    }

}
