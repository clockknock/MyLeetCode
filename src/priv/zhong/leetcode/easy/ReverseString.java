package priv.zhong.leetcode.easy;

/**
 * @author 钟未鸣
 * @date 2018/1/5
 */
public class ReverseString {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        char[] targets = new char[chars.length];
        int j = 0;

        for (int i = chars.length-1; i >= 0; i--) {
            targets[j] = chars[i];
            j++;
        }
        return new String(targets);
    }
}
