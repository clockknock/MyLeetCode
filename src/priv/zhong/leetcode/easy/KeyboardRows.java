package priv.zhong.leetcode.easy;

import java.util.stream.Stream;

/**
 * @author 钟未鸣
 * @date 2018/1/5
 */
public class KeyboardRows {
    public String[] findWords(String[] words) {
        String keyboardRegex = "[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*";
        return Stream.of(words)
                .filter(word -> word.toLowerCase().matches(keyboardRegex))
                .toArray(String[]::new);
    }
}
