//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

import java.util.Arrays;
class S0003 {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int result = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            //小写字母charAt转换为int类型后数值范围为[97,122]
            start = Math.max(start, last[index] + 1);
            //
            result = Math.max(result, i - start + 1);
            last[index] = i;
        }
        return result;
    }
}