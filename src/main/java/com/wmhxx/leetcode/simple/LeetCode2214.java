package com.wmhxx.leetcode.simple;

/**
 * LeetCode2214
 *
 * @author wmhxx
 * @date 2022/01/13
 */
public class LeetCode2214 {

    /**
     * 一个 句子由一些 单词以及它们之间的单个空格组成，句子的开头和结尾不会有多余空格。
     * <p>
     * 给你一个字符串数组sentences，其中sentences[i]表示单个 句子。
     * <p>
     * 请你返回单个句子里 单词的最多数目。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/maximum-number-of-words-found-in-sentences
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String[] strings = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int length = new LeetCode2214().length(strings);
        System.out.println(length);
    }


    public int length(String[] sentences) {
        int length = 0;
        for (String string : sentences) {
            int length1 = string.split(" ").length;
            if (length1 > length) {
                length = length1;
            }
        }
        return length;
    }

}
