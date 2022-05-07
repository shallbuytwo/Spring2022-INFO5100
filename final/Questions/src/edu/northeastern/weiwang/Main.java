package edu.northeastern.weiwang;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    // Question 1
    public static boolean isValid(String s) {
        if (s.isEmpty()) return true;
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '[') st.push(']');
            else if (c == '{') st.push('}');
            else if (st.isEmpty() || st.pop() != c) return false;
        }
        return st.isEmpty();
    }

    // Question 2
    public static String compressString(String str){
        if (str.length() <= 2) return str;
        char currentChar = str.charAt(0);
        int currentTimes = 1;

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); ++i) {
            if (str.charAt(i) == currentChar) {
                ++currentTimes;
            } else {
                sb.append(currentChar);
                sb.append(currentTimes);
                currentChar = str.charAt(i);
                currentTimes = 1;
            }
        }
        sb.append(currentChar);
        sb.append(currentTimes);

        if (sb.length() < str.length()) return sb.toString();
        return str;
    }

    // Question 3
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        int l = 0, maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            while (charSet.contains(s.charAt(r))) {
                charSet.remove(s.charAt(l));
                ++l;
            }
            charSet.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    // Question 4
    public static int[] sumZero(int n) {
        int[] ret = new int[n];
        for (int i = 0; i < n; i++) {
            ret[i] = i * 2 - n + 1;
        }
        return ret;
    }

    // Question 5
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; ++i) {
            pq.add(nums[i]);
            if (pq.size() > k) pq.remove();
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        // Question 1 Test
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));

        // Question 2 Test
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("ab"));

        // Question 3 Test
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

        // Question 4 Test
        int[] q4a = sumZero(5);
        for (int i = 0; i < q4a.length; ++i) {
            System.out.print(q4a[i]);
            System.out.print(" ");
        }
        System.out.println();
        int[] q4b = sumZero(3);
        for (int i = 0; i < q4b.length; ++i) {
            System.out.print(q4b[i]);
            System.out.print(" ");
        }
        System.out.println();

        // Question 5 Test
        int[] q5a = {3,2,1,5,6,4};
        System.out.println(findKthLargest(q5a, 2));
        int[] q5b = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(q5b, 4));
    }
}
