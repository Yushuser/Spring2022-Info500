package edu.northeastern.yushu;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(Question6(s));
    }
    // Question 6
    public static int Question6(String s) {
        if (s.length() == 0) {
            return 0;
        }
        // Use HashMap to keep char and its index map
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0; // the longest substring
        int left = 0; // pointer
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            // update
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
