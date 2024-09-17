package main.java.com.dkcody;

import java.util.Arrays;
import java.util.stream.*;


public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint solution = new ArrayPrint();

        // Test case 
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));  
        // Output should be [1, 2, 2, 3, 5, 6]
    }

        public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Convert IntStream to Stream<Integer> using boxed()
        int[] mergedArray = Stream.concat(
                Arrays.stream(nums1, 0, m).boxed(),  // First m elements of nums1, boxed to Stream<Integer>
                Arrays.stream(nums2, 0, n).boxed()   // First n elements of nums2, boxed to Stream<Integer>
        ).sorted().mapToInt(Integer::intValue).toArray();  // Convert Stream<Integer> back to int[]
        
        // Copy the sorted merged array back into nums1
        System.arraycopy(mergedArray, 0, nums1, 0, m + n);
    }
 }


