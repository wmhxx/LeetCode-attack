package com.wmhxx.leetcode.simple;

import java.util.Arrays;

/**
 * LeetCode1929
 *
 * @author wmhxx
 * @date 2022/01/13
 */
public class LeetCode1929 {

    /**
     * 给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，对于所有0 <= i < n 的 i ，满足下述所有要求：
     * <p>
     * ans[i] == nums[i]
     * ans[i + n] == nums[i]
     * 具体而言，ans 由两个 nums 数组 串联 形成。
     * <p>
     * 返回数组 ans 。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/concatenation-of-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] ints = new int[]{1, 3, 2, 1};
        int[] concatenation = new LeetCode1929().getConcatenation(ints);
        System.out.println(Arrays.toString(concatenation));
    }


    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];
        System.arraycopy(nums, 0, ans, 0, length);
        System.arraycopy(nums, 0, ans, length, length);
        return ans;
    }
}
