package priv.zhong.leetcode.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 钟未鸣
 * @date 2018/1/5
 * Write a program that outputs the string representation of numbers from 1 to n.
 * <p>
 * But for multiples of three it should output “Fizz” instead of the number and for the
 * multiples of five output “Buzz”. For numbers which are multiples of both three
 * and five output “FizzBuzz”.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        int i  =1;
        while(i<=n){
            StringBuilder sb = new StringBuilder("");
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                sb.append(String.valueOf(i));
                list.add(sb.toString());
            }
            i++;
        }
        return list;
    }
}
