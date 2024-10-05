class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long res = 1;  // Initialize the result as the smallest positive integer we are looking for.

        // Traverse through the sorted array.
        for (int i = 0; i < arr.length; i++) {
            // If current element is greater than res, we found the gap.
            if (arr[i] > res) {
                break;
            }

            // Otherwise, we can form sums from 1 to res + arr[i] - 1.
            res += arr[i];
        }

        return res;
    }
}