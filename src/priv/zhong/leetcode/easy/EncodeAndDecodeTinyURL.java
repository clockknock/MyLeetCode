package priv.zhong.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟未鸣
 * @date 2018/1/8
 * 抄了个别人的
 */
public class EncodeAndDecodeTinyURL {

    public static void main(String[] args) {
        Codec codec=new Codec();
        String encode = codec.encode("https://leetcode.com/submissions/detail/135130219/");
        System.out.println(encode);
        String decode = codec.decode(encode);
        System.out.println(decode);

    }

    public static class Codec {
        HashMap<String, String> map = new HashMap<>();
        HashMap<Long, String> idToLongURL = new HashMap<>();
        long count = 1;
        char[] elements = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        // Encodes a URL to a shortened URL.
        String encode(String longUrl) {
            if (map.containsKey(longUrl)) {
                return map.get(longUrl);
            } else {
                String shortUrl = idToShortURL(count);
                idToLongURL.put(count, longUrl);
                count++;
                return shortUrl;
            }
        }

        private String idToShortURL(long n) {
            StringBuilder sb = new StringBuilder();
            while(n!=0) {
                sb.append(elements[(int)(n%(long)62)]);
                n /= (long)62;
            }
            sb.reverse();
            return sb.toString();
        }

        private long shortURLToId(String s) {
            long id = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    id = id*62 + s.charAt(i) - 'a';
                }
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    id = id*62 + s.charAt(i) - 'A' + 36;
                }
                if (s.charAt(i) >= '0' && s.charAt(i) <= '1') {
                    id = id*62 + s.charAt(i) - '0' + 26;
                }
            }
            return id;
        }
        // Decodes a shortened URL to its original URL.
        String decode(String shortUrl) {
            long id = shortURLToId(shortUrl);
            return idToLongURL.get(id);
        }
    }
}
