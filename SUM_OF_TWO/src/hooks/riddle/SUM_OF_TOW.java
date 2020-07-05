package hooks.riddle;

/*
Given an array A[] and a number x, check for pair in A[] with sum as x
Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x.
Examples:
Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output: -1
No valid pair exists.
*/

import java.util.HashSet;
import java.util.Set;

public class SUM_OF_TOW {

//    public static boolean hasArrayTwoCandidates(int A[], int sum) {
//        int l, r, arr_size;
//
//        /* Sort the elements */
//        Arrays.sort(A);
//
//        l = 0;
//        arr_size = A.length;
//        r = arr_size - 1;
//        while (l < r) {
//            int sumOfTwo = A[l] + A[r];
//            if (sumOfTwo == sum)
//                return true;
//            else if (sumOfTwo < sum)
//                l++;
//            else
//                r--;
//        }
//        return false;
//    }

    public static boolean hasArrayTwoCandidates(int A[], int sum) {
        Set<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < A.length ; i++) {
            var temp = sum - A[i];
            if (hashSet.contains(temp)) {
                return true;
            } else {
                hashSet.add(A[i]);
            }
        }
        return false;
    }

}
