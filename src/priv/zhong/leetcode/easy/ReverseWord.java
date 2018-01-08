package priv.zhong.leetcode.easy;

/**
 * @author 钟未鸣
 * @date 2018/1/5
 */
public class ReverseWord {
    public static void main(String[] args) {

    }

    private static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer sb= new StringBuffer();
        for (String word : words) {
            sb.append(new StringBuffer(word).reverse()).append(" ");
        }

        return sb.toString().trim();
    }
}
