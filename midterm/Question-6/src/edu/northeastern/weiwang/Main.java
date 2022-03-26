package edu.northeastern.weiwang;

public class Main {
    public static int longestSubstringWithoutRepeatingChars(String s) {
        // Store the index of when we last time saw it for this char.
        int[] characters = new int[256];
        // Initially set them all to -1.
        for (int i = 0; i < 256; ++i) characters[i] = -1;
        // final result
        int ret = 0;
        // left index
        int i = 0;
        // move right index
        for (int j = 0; j < s.length(); ++j) {
            if (characters[s.charAt(j)] != -1) {
                // move left index if needed
                i = Math.max(i, characters[s.charAt(j)] + 1);
            }
            // update ret if needed
            ret = Math.max(ret, j - i + 1);
            // update when we last time saw this char.
            characters[s.charAt(j)] = j;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeatingChars("abcabcbb"));
        System.out.println(longestSubstringWithoutRepeatingChars("bbbbb"));
        System.out.println(longestSubstringWithoutRepeatingChars("pwwkew"));
    }
}
