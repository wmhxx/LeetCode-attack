package com.wmhxx.leetcode.simple;

/**
 * LeetCode1920
 *
 * @author wmhxx
 * @date 2022/01/13
 */
public class LeetCode1920 {

    /**
     * 给你一个 从 0 开始的排列 nums（下标也从 0 开始）。请你构建一个 同样长度 的数组 ans ，其中，对于每个 i（0 <= i < nums.length），
     * 都满足 ans[i] = nums[nums[i]] 。返回构建好的数组 ans 。
     *
     * 从 0 开始的排列 nums 是一个由 0 到nums.length - 1（0 和 nums.length - 1 也包含在内）的不同整数组成的数组。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/build-array-from-permutation
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        int[] ints = {5,0,1,2,3,4};
        int[] ints1 = new LeetCode1920().buildArray(ints);
        System.out.println(ints1);
    }



    public int[] buildArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //5       4
            //0
            System.out.println(nums[i]);
            nums[i] = nums[nums[i]];
        }

        for (int num : nums) {
            //System.out.println(num);
        }
        return nums;
    }


}
