package cn.bdqn.demo.algorithm;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author banzijian
 * @date 2018/08/29
 **/
public class MaxHeap {

    public static void main(String[] args) {
        String s = "IV";
        int i = romanToInt(s);
        System.out.println(i);
    }
    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int l = s.length();
        int i = 0;
        int res = 0;
        while (i < l) {
            if (i < l - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                res += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i += 2;
            } else {
                res += map.get(s.charAt(i));
                i++;
            }
        }
        return res;
    }

}
