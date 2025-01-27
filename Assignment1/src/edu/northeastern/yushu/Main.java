package edu.northeastern.yushu;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Question 1: Write a program find if String is Palindrome?
        System.out.println("Question 1:");
        String text="civic";
        if (isPalindrome(text))
            System.out.println("The String " + text + " is Palindrome.");
        else
            System.out.println("The String " + text + " is not Palindrome.");
        System.out.println("==========================================");
        //Question2: Write a program to check if a string has all unique characters.
        System.out.println("Question 2:");
        String input = "help";
        if (uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters.");
        else
            System.out.println("The String " + input + " has duplicate characters.");
        //Question 3. Write a program to check if string contains duplicates
        System.out.println("==========================================");
        System.out.println("Question 3:");
        String s = "Tools";
        if (check(s)) {
            System.out.println(s + " contains duplicate.");
        } else
            System.out.println(s + " contains all unique characters.");
        //Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
        System.out.println("==========================================");
        System.out.println("Question 4:");
        char str1[] = {'l', 'i', 's', 't', 'e', 'n'};
        char str2[] = {'s', 'i', 'l', 'e', 'n', 't'};
        if (areAnagram(str1, str2))
            System.out.println("The two strings are" + " anagram of each other");
        else
            System.out.println("The two strings are not" + " anagram of each other.");
        //Question 5:  Write a program to determine whether the year is a leap year or not.
        System.out.println("==========================================");
        System.out.println("Question 5:");
        int year = 2004;
        if (isLeapYear(year)) {
            System.out.println("Leap Year : " + year);
        } else {
            System.out.println(year + "is not a Leap Year!");
        }
        //Question 6:
        System.out.println("==========================================");
        System.out.println("Question 6:");
        System.out.println(calculateBills(222));
        //Question 7:
        System.out.println("==========================================");
        System.out.println("Question 7:");
        String ran="Homework",mag= "the Homework 1";
        if (canConstruct(ran,mag))
            System.out.println("RansomNote "+ran+" can be constructed from magazine " +mag);
        else
            System.out.println("RansomNote cannot be constructed from magazine");
        //Question 8:
        System.out.println("==========================================");
        System.out.println("Question 8:");
        System.out.println(grade('F'));
        //Question 9:
        System.out.println("==========================================");
        System.out.println("Question 9:");
        Book book = new Book("JAVA",002103,"Education", 19.99);
        System.out.println(book.getGenres());
        //Question 10:
        System.out.println("==========================================");
        System.out.println("Question 10:");
        Box box = new Box(9.9,4.3,3.2);
        System.out.println(box.volume());
    }
//Question 1: Write a program find if String is Palindrome?
    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
//Question2: Write a program to check if a string has all unique characters.
    public static boolean uniqueCharacters(String str) {
        // If at any time we encounter 2 same characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
        // If no duplicate characters encountered,return true
        return true;
    }
//Question 3. Write a program to check if string contains duplicates
    public static boolean check(CharSequence g) {
        for (int i = 0; i < g.length(); i++) {
            for (int j = i + 1; j < g.length(); j++) {
                if (g.charAt(i) == g.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
//Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
    public static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;
        // If length of both strings is not same,then they cannot be anagram
        if (n1 != n2)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i])
                return false;
        }
        return true;
    }
//Question 5:  Write a program to determine whether the year is a leap year or not.
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
// Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
//    Plus $ 0.60 per call for next 50 calls.
//    Plus $ 0.50 per call for next 50 calls.
//    Plus $ 0.40 per call for any call beyond 200 calls.
//    Use Switch Statement in the function.
    public static double calculateBills(int calls) {
        double bills = 0;
        int index = calls / 50;
        switch (index) {
            case 0:
                bills = 200;
                break;
            case 1:
                bills = 200;
                break;
            case 2:
                bills = 200 + (calls - 100) * 0.6;
                break;
            case 3:
                bills = 230 + (calls - 150) * 0.5;
                break;
            default:
                bills = 255 + (calls - 200) * 0.4;
                break;
        }
        return bills;
    }
    //  Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.Each letter in magazine can only be used once in ransomNote.
    public static boolean canConstruct(String ran, String mag) {
        if (ran.length() > mag.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : mag.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (char i : ran.toCharArray()) {
            if (map.get(i) == 0) {
                return false;
            }
            map.put(i, map.get(i) - 1);
        }
        return true;
    }
//    Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
//    Grade Meaning
//    A Excellent
//    B Good
//    C Average
//    D Deficient
//    F Failing
    public static char grade(char g) {
        switch (g) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
                break;
            default:
                System.out.println("Invalid input");
        }
        return g;
    }
//    Question 9: Write a program to create a book class. The Book class would have following private variables
//    String name;
//    int bookID;
//    String genres;
//    double price;
//    Create a constructor to initialize the values. Create getters and setters for variables.
static class Book {
        private String name;
        private int bookID;
        private String genres;
        private double price;
        public Book(String n, int bookID, String g, double p) {
            this.name = n;
            this.bookID = bookID;
            this.genres = g;
            this.price = p;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getBookID() {
            return bookID;
        }
        public void setBookID(int bookID) {
            this.bookID = bookID;
        }
        public String getGenres() {
            return genres;
        }
        public void setGenres(String genres) {
            this.genres = genres;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
    }
//      Question 10: Implement a class Box class Box {
//        double width;
//        double height;
//        double depth;
//    }
//    Initialize the value through constructor. Write a function to calculate the box volume.
    static class Box {
        double width;
        double height;
        double depth;
        public Box(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        public double volume() {
            return width * height * depth;
        }
    }
}
