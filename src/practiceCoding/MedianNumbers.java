package practiceCoding;

import java.util.Arrays;

public class MedianNumbers {
  
    public static void main(String[] args) {

        int [] arr = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k = 4;
        String output= findMedian(arr, k);
        System.out.println("output = " + output);
    }

    private static String findMedian(int[] arr, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= arr.length -k; i++) {
            int [] window= Arrays.copyOfRange(arr, i, i +k);
            Arrays.sort(window);

        double median;
        if(k%2==0){
            median= (window [k / 2-1] +window [k/2])/2.0;
            }else {
            median =window[k/2];
        }
        result.append(median).append(" ");
    }
        return result.toString().trim();
    }
}

/*
Median of sliding window in an array
Given an array of integer arr[] and an integer k, the task is to find the median of each window of size k
starting from the left and moving towards the right by one position each time.
Examples:
Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k=3;    // this is my array and k=3 is how many elements I will have in summary
Output: 5 8 8 3 3 3
Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k=4;
Output: 6.5 6.5 5.5 3.0 2.5
 */
