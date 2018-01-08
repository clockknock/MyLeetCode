package priv.zhong.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟未鸣
 * @date 2017/12/31
 */
public class JudgeRouteCircle {
    public static void main(String[] args) {
        System.out.println(judge("RLLR"));
    }

    private static boolean judge(String moves) {
        char[] chars = moves.toCharArray();
        Map<Character, Integer> counter = new HashMap<>(4);
        counter.put('L', 0);
        counter.put('R', 0);
        counter.put('U', 0);
        counter.put('D', 0);
        for (char c : chars) {
            counter.replace(c, counter.get(c) + 1);
        }

        return counter.get('L').equals(counter.get('R')) && counter.get('U').equals(counter.get('D'));

    }

    /**
     * best?
     * @param moves
     */
    public boolean judgeCircle(String moves) {
        int[] temp=new int[128];
        for(char i:moves.toCharArray()){
            temp[i]++;
        }
        if(temp['R']!=temp['L'] || temp['U']!=temp['D']){
            return false;
        }else{
            return true;
        }
    }
}
