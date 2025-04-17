package com.maxim;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1, 3};


//        ArrayHelper.printArray(data);           // ➜ [5, 2, 8, 1, 3]
//        ArrayHelper.sortArray(data);
//        ArrayHelper.printArray(data);           // ➜ [1, 2, 3, 5, 8]
//
//        int[] copy = ArrayHelper.copyArray(data);
//        System.out.println(ArrayHelper.areEqual(data, copy)); // ➜ true
//
//        ArrayHelper.fillArray(copy, 9);
//        ArrayHelper.printArray(copy);           // ➜ [9, 9, 9, 9, 9]
//
//        int index = ArrayHelper.binarySearch(data, 5);
//        System.out.println("Found at: " + index); // ➜ Found at: 3 (after sorting)
//
//        int[] part = ArrayHelper.sliceArray(data, 1, 4);
//        ArrayHelper.printArray(part);

        // exos
        sumArray(data);
        findMaxAndMin(data);
    }

    private static void sumArray(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum = " + sum);
    }

    private static void findMaxAndMin(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int max = copy[copy.length - 1];
        int min = copy[0];
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        compareArrays(arr, copy);
    }

    private static void compareArrays(int[] arr, int[] compare) {
        int res = Arrays.compare(arr, compare);
        System.out.println(res);
    }

    private static void fillArray(int value) {
        int[] arrToFill;
        Arrays.fill(arrToFill, valuee);
        System.out.println(arrToFill);
    }
    private static void binarySearch(int[] arr, int target) {
        // Write a method that:
        // - Sorts the array
        // -Searches for a specific number using Arrays.binarySearch().
    }
    private static void sliceAnArray(int[] arr, int target) {
        // Write a method that:
        // - Sorts the array
        // -Searches for a specific number using Arrays.binarySearch().
    }
    private static void removeDuplicates() {
        int[] arr = new int[10];
    }
    private static void reverseAnArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
//            reversed.
        }
    }
    /**
     * 1. Find the second largest number in the array.
     * If the array has duplicates, ignore them for ranking.
     */
    public static int secondLargest(int[] arr) {
        // Your code here
        return 0;
    }

    /**
     * 2. Check if the array is a palindrome.
     * Return true if the array reads the same forward and backward.
     */
    public static boolean isPalindrome(int[] arr) {
        // Your code here
        return false;
    }

    /**
     * 3. Rotate the array to the right by k steps.
     * For example, [1,2,3,4,5] rotated by 2 becomes [4,5,1,2,3].
     */
    public static void rotateRight(int[] arr, int k) {
        // Your code here
    }

    /**
     * 4. Count how many times each number appears in the array.
     * Return a Map with the number as key and count as value.
     */
    public static Map<Integer, Integer> countOccurrences(int[] arr) {
        // Your code here
        return null;
    }

    /**
     * 5. Merge two arrays and return a sorted array without duplicates.
     */
    public static int[] mergeAndSortUnique(int[] a, int[] b) {
        // Your code here
        return null;
    }

    /**
     * 6. Return all elements that appear more than once in the array.
     */
    public static List<Integer> findDuplicates(int[] arr) {
        // Your code here
        return null;
    }

    /**
     * 7. Find the longest increasing sequence in the array.
     * Example: [1, 2, 2, 3, 4] -> longest is [2, 3, 4]
     */
    public static int[] longestIncreasingSequence(int[] arr) {
        // Your code here
        return null;
    }

    /**
     * 8. Check if two arrays contain the same elements regardless of order.
     * You may assume no duplicates for simplicity.
     */
    public static boolean sameElements(int[] a, int[] b) {
        // Your code here
        return false;
    }

    /**
     * 9. Move all zeros in the array to the end, keeping the order of other elements.
     * Example: [0, 1, 0, 3, 0, 5] -> [1, 3, 5, 0, 0, 0]
     */
    public static void moveZerosToEnd(int[] arr) {
        // Your code here
    }

    /**
     * 10. Calculate the average of all prime numbers in the array.
     */
    public static double averageOfPrimes(int[] arr) {
        // Your code here
        return 1.0;
    }
    // 1. Check if two strings are anagrams
    // Hint: Sort both strings or use frequency map
    public static boolean isAnagram(String a, String b) {
        return false;
    }

    // 2. Count vowels and consonants
    // Hint: Use Character.isLetter and check against vowels
    public static int[] countVowelsAndConsonants(String s) {
        // TODO: Return int[]{vowelCount, consonantCount}
        return null;
    }

    // 3. Find the longest word in a sentence
    // Hint: Use String.split(" ") and compare lengths
    public static String longestWord(String sentence) {
        // TODO: Your code here
        return null;
    }

    // 4. Check if a string is a palindrome (ignore spaces/case)
    // Hint: Clean string and compare with reverse
    public static boolean isCleanPalindrome(String s) {
        // TODO: Your code here
        return false;
    }

    // 5. Compress a string ("aaabb" => "a3b2")
    // Hint: Use StringBuilder and loop to count repeats
    public static String compressString(String s) {
        // TODO: Your code here
        return null;
    }

    // 🧮 2D ARRAY EXERCISES

    // 6. Sum all elements of a 2D array
    public static int sumMatrix(int[][] matrix) {
        // TODO: Use nested loops to sum
        return 0;
    }

    // 7. Check if matrix is symmetric
    // Hint: matrix[i][j] == matrix[j][i]
    public static boolean isSymmetric(int[][] matrix) {
        // TODO: Your code here
        return false;
    }

    // 8. Print diagonals of a square matrix
    public static void printDiagonals(int[][] matrix) {
        // TODO: Print primary and secondary diagonals
    }

    // 9. Find the max element in 2D array
    public static int findMax(int[][] matrix) {
        // TODO: Track max while iterating
        return 0;
    }

    // 10. Transpose the matrix
    // Hint: result[j][i] = matrix[i][j]
    public static int[][] transpose(int[][] matrix) {
        // TODO: Create new matrix and transpose
        return null;
    }

    // 🔁 RECURSION EXERCISES

    // 11. Factorial using recursion
    public static int factorial(int n) {
        // TODO: Base case n <= 1, else n * factorial(n-1)
        return 0;
    }

    // 12. Fibonacci using recursion
    public static int fibonacci(int n) {
        // TODO: Base case n == 0 or 1, else fib(n-1) + fib(n-2)
        return 0;
    }

    // 13. Sum of digits using recursion
    public static int sumDigits(int n) {
        // TODO: n % 10 + sumDigits(n / 10)
        return 0;
    }

    // 14. Reverse a string using recursion
    public static String reverse(String s) {
        // TODO: Take first character, reverse rest, then append
        return null;
    }

    // 15. Check palindrome recursively
    public static boolean isPalindromeRec(String s, int left, int right) {
        // TODO: Compare chars and recurse
        return false;
    }
}