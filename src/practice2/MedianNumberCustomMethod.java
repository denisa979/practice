package practice2;

import java.util.Arrays;

public class MedianNumberCustomMethod {

    public static void main(String[] args) {
        int[] arr = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k = 3;

        int[] arr1 = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k1 = 4;

        String output = findMedian(arr, k, arr1, k1);
        System.out.println("output = " + output );
    }
    private static String findMedian(int[] arr, int k, int[] arr1, int k1) {

        StringBuilder result = new StringBuilder();
        //Creates a StringBuilder to store the medians as a single string.

        // Process arr with window size k
        for (int i = 0; i <= arr.length - k; i++) {
            //Loops through the first array arr to process each sliding window of size k.

            int[] window = Arrays.copyOfRange(arr, i, i + k);
            //Extracts a subarray (sliding window) of size k starting at index i.

            Arrays.sort(window);
            //Sorts the extracted window to calculate the median.

            double median;
            if (k % 2 == 0) {
                //Checks if the window size k is even.

                median = (window[k / 2 - 1] + window[k / 2]) / 2.0;
                //Calculates the median for an even-sized window by averaging the two middle elements.
            } else {
                median = window[k / 2];
            }
            result.append(median).append(" ");
            //Appends the calculated median to the StringBuilder, followed by a space.
        }
        // Process arr1 with window size k1
        for (int i = 0; i <= arr1.length - k1; i++) {
            int[] window1 = Arrays.copyOfRange(arr1, i, i + k1);
            Arrays.sort(window1);

            double median1;
            if (k1 % 2 == 0) {
                median1 = (window1[k1 / 2 - 1] + window1[k1 / 2]) / 2.0;
            } else {
                median1 = window1[k1 / 2];
            }
            result.append(median1).append(" ");
        }
        return result.toString().trim();
        //Converts the StringBuilder to a string, trims any trailing spaces, and returns it.
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
