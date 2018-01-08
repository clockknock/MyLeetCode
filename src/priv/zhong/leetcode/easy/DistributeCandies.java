package priv.zhong.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 钟未鸣
 * @date 2018/1/5
 */
public class DistributeCandies {
    public static void main(String[] args) {
        int[] candis = {1000, 1, 1, 1};
        int i = distributeCandies(candis);
    }

    private static int distributeCandies(int[] candies) {
        int candiesHalfLen = candies.length / 2;
        Map<Integer, Integer> map = new HashMap<>(candiesHalfLen);
        int typeCount = 0;
        int singleCount = 0;
        for (int type : candies) {
            if (map.containsKey(type)) {
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }

        }

        for (Integer key : map.keySet()) {
            Integer integer = map.get(key);
            if (integer % 2 == 0) {
                typeCount++;
            } else {
                singleCount++;
            }
        }


        int i = typeCount + singleCount;
        if(i> candiesHalfLen){
            return candiesHalfLen;
        }
        return i;
    }
}
