package edu.northeastern.yushu;

import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("================ Question 1 ================");
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println("================ Question 2 ================");
        System.out.println(compressString("abc"));
        System.out.println(compressString("aabcccccaaad"));
        System.out.println("================ Question 3 ================");
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println("================ Question 4 ================");
        System.out.println(sumZero(5));
        System.out.println(sumZero(3));
        System.out.println("================ Question 5 ================");
        int[] num1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println(findKthLargest((num1), k1));
        int[] num2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println(findKthLargest((num2), k2));
    }
    // Question1:
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char ch: s.toCharArray()){
            if(!stack.empty() && (stack.peek() == ch - 1 || stack.peek() == ch - 2)){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.empty();
    }
    // Question2:
    public static String compressString(String str){
        if (str == null || str.length() == 0) {
            return str;
        }

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (j < str.length()) {
            if (str.charAt(i) != str.charAt(j)) {
                sb.append(str.charAt(i));
                sb.append(j - i);
                i = j;
            }
            j++;
        }
        sb.append(str.charAt(i));
        sb.append(j - i);

        if (sb.length() >= str.length()) {
            return str;
        }
        return sb.toString();
    }
    // Question3:
    public static int lengthOfLongestSubstring(String s) {
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
    // Question4:
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            arr[index++] = -i;
            arr[index++] = i;
        }
        return arr;
    }
    // Question5:
    static Random random = new Random();

    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public static int quickSelect(int[] a, int left, int right, int index) {
        int q = randomPartition(a, left, right);
        if (q == index) {
            return a[q];
        } else {
            return q < index ? quickSelect(a, q + 1, right, index) : quickSelect(a, left, q - 1, index);
        }
    }

    public static int randomPartition(int[] a, int l, int r) {
        int i = random.nextInt(r - l + 1) + l;
        swap(a, i, r);
        return partition(a, l, r);
    }

    public static int partition(int[] a, int l, int r) {
        int x = a[r], i = l - 1;
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
