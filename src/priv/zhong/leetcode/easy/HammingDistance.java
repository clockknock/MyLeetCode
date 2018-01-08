package priv.zhong.leetcode.easy;

/**
 * @author 钟未鸣
 * @date 2017/12/30
 */
public class HammingDistance {
    public static void main(String[] args) {
        int a = 1;
        a  = ~a;
        System.out.println(distance(1, 4));
    }

    private static int distance(int x, int y) {
        int distance = 0;
        int target = x ^ y;
        int length = 32;
        int i = 0;
        while (i < length) {
            distance += target >> i & 1;
            i++;
        }

        return distance;
    }
}
