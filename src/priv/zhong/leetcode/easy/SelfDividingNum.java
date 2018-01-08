package priv.zhong.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 钟未鸣
 * @date 2017/12/31
 */
public class SelfDividingNum {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(valid(num));
    }

    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (valid(i)) {
                list.add(i);
            }
        }

        return list;
    }

    private static boolean valid(int num) {
        int cur = num;
        while (cur != 0) {
            int dig = cur % 10;
            if (dig == 0 || ((num % dig) != 0)) {
                return false;
            }
            cur = cur / 10;
        }
        return true;
    }
}
