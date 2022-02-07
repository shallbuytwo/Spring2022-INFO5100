package edu.northeastern.weiwang;

public class Main {
    public static void main(String[] args) {
        System.out.println("Question 1");
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("aaa"));
        System.out.println("----------");

        System.out.println("Question 2");
        System.out.println(areAllCharsUnique(""));
        System.out.println(areAllCharsUnique("abc"));
        System.out.println(areAllCharsUnique("aaa"));
        System.out.println("----------");

        System.out.println("Question 3");
        System.out.println(containsDuplicate(""));
        System.out.println(containsDuplicate("abc"));
        System.out.println(containsDuplicate("aaa"));
        System.out.println("----------");

        System.out.println("Question 4");
        System.out.println(areAnagrams("", ""));
        System.out.println(areAnagrams("abcc", ""));
        System.out.println(areAnagrams("abcc", "acbc"));
        System.out.println(areAnagrams("abcc", "acbb"));
        System.out.println("----------");

        System.out.println("Question 5");
        System.out.println(isLeapYear(1991));
        System.out.println(isLeapYear(1996));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2100));
        System.out.println("----------");

        System.out.println("Question 6");
        System.out.println(calculatePhoneBill(78));
        System.out.println(calculatePhoneBill(128));
        System.out.println(calculatePhoneBill(178));
        System.out.println(calculatePhoneBill(228));
        System.out.println("----------");

        System.out.println("Question 7");
        System.out.println(canConstructRansomNote("", "aaa"));
        System.out.println(canConstructRansomNote("aaa", ""));
        System.out.println(canConstructRansomNote("aaa", "aaabc"));
        System.out.println(canConstructRansomNote("aaabc", "aaa"));
        System.out.println("----------");

        System.out.println("Question 8");
        System.out.println(gradeToMeaning('A'));
        System.out.println(gradeToMeaning('B'));
        System.out.println(gradeToMeaning('C'));
        System.out.println(gradeToMeaning('D'));
        System.out.println(gradeToMeaning('F'));
        System.out.println(gradeToMeaning(' '));
        System.out.println("----------");

        System.out.println("Question 9");
        Book book = new Book("Java", 123, "Programming Languages", 10);
        System.out.println(book.getName());
        System.out.println(book.getBookID());
        book.setBookID(345);
        System.out.println(book.getBookID());
        System.out.println("----------");

        System.out.println("Question 10");
        Box box = new Box(2, 3, 4);
        System.out.println(box.calculateVolume());
        System.out.println("----------");
    }

    // For string related questions, we ignored the check for null since some
    // boundary checks can be very burdensome and not the point of this work.
    // Putting this comment here to note that I indeed am aware of the issue.

    // Question 1
    static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                ++left;
                --right;
            }
        }
        return true;
    }

    // Question 2 - Assuming 256 ASCII chars
    static boolean areAllCharsUnique(String s) {
        if (s.isEmpty()) return true;
        boolean[] letters = new boolean[256];
        for (int i = 0; i < 256; ++i) letters[i] = false;
        for (char c : s.toCharArray()) {
            if (letters[c] == true) return false;
            letters[c] = true;
        }
        return true;
    }

    // Question 3 - Assuming 256 ASCII chars
    // This is just the negation of the previous question.
    static boolean containsDuplicate(String s) {
        return !areAllCharsUnique(s);
    }

    // Question 4 - Assuming 256 ASCII chars
    static boolean areAnagrams(String s1, String s2) {
        int[] s1Letters = new int[256];
        int[] s2Letters = new int[256];
        for (int i = 0; i < 256; ++i) {
            s1Letters[i] = 0;
            s2Letters[i] = 0;
        }
        for (char c : s1.toCharArray()) {
            ++s1Letters[c];
        }
        for (char c : s2.toCharArray()) {
            ++s2Letters[c];
        }
        for (int i = 0; i < 256; ++i) {
            if (s1Letters[i] != s2Letters[i]) return false;
        }
        return true;
    }

    // Question 5
    static boolean isLeapYear(int year) {
        if (year < 0) return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Question 6
    // Not exactly sure why we need to use switch case in this question.
    static double calculatePhoneBill(int numOfCalls) {
        if (numOfCalls <= 0) return 0;
        int ladder = -1;
        if (numOfCalls <= 100) ladder = 1;
        if (numOfCalls > 100 && numOfCalls <= 150) ladder = 2;
        if (numOfCalls > 150 && numOfCalls <= 200) ladder = 3;
        if (numOfCalls > 200) ladder = 4;
        double total = 0;
        switch (ladder) {
            case 1:
                total = 200;
                break;
            case 2:
                total = 200 + (numOfCalls - 100) * 0.6;
                break;
            case 3:
                total = 200 + 50 * 0.6 + (numOfCalls - 150) * 0.5;
                break;
            case 4:
                total = 200 + 50 * 0.6 + 50 * 0.5 + (numOfCalls - 200) * 0.4;
                break;
            default:
                // Shouldn't reach here at all.
                total = -1;
        }
        return total;
    }

    // Question 7
    static boolean canConstructRansomNote(String ransomNote, String magazine) {
        if (ransomNote.isEmpty()) return true;
        if (magazine.isEmpty()) return false;
        int[] ransomNoteLetters = new int[256];
        int[] magazineLetters = new int[256];
        for (int i = 0; i < 256; ++i) {
            ransomNoteLetters[i] = 0;
            magazineLetters[i] = 0;
        }
        for (char c : ransomNote.toCharArray()) {
            ++ransomNoteLetters[c];
        }
        for (char c : magazine.toCharArray()) {
            ++magazineLetters[c];
        }
        for (int i = 0; i < 256; ++i) {
            if (ransomNoteLetters[i] > magazineLetters[i]) return false;
        }
        return true;
    }

    // Question 8
    // Note that we didn't support lower case letters intentionally.
    static String gradeToMeaning(char grade) {
        switch (grade) {
            case 'A':
                return "Excellent";
            case 'B':
                return "Good";
            case 'C':
                return "Average";
            case 'D':
                return "Deficient";
            case 'F':
                return "Failing";
        }
        return "Not Implemented";
    }

    // Question 9
    // See Book.java

    // Question 10
    // See Box.java
}
