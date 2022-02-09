package com.wmhxx.leetcode.simple;

/**
 * LeetCode28
 *
 * @author wmhxx
 * @date 2022/01/14 18:06:45
 */
public class LeetCode28 {

    /**
     * 实现strStr()函数。
     * <p>
     * 给你两个字符串haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1 。
     * <p>
     * 说明：
     * <p>
     * 当needle是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
     * <p>
     * 对于本题而言，当needle是空字符串时我们应当返回 0 。这与 C 语言的strstr()以及 Java 的indexOf()定义相符。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/implement-strstr
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String haystack = "asdasdsarwqewqrxfsadsadsaedweqe  e", needle = "we";
        int i = new LeetCode28().strStr(haystack, needle);
        System.out.println(i);
    }



    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }


//    public int strStr(String haystack, String needle) {
//        int n = haystack.length(), m = needle.length();
//        boolean flag;
//        for (int i = 0; i <= (n - m); i++) {
//            flag = false;
//            for (int j = 0; j < m; j++) {
//                if (haystack.charAt(i + j) != needle.charAt(j)) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                return i;
//            }
//        }
//        return -1;
//    }



}
