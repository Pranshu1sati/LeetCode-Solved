class Solution {
    public void nextPermutation(int[] A) {
        int n = A.length; // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            reverse(A, 0, n - 1);
            return;
        }

        // Step 2: Find the next greater element
        //         and swap it with A[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                int tmp = A[i];
                A[i] = A[ind];
                A[ind] = tmp;
                break;
            }
        }

        // Step 3: reverse the right half:
        reverse(A, ind + 1, n - 1);

        return;
 }
    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            int tmp = A[start];
            A[start] = A[end];
            A[end] = tmp;
            start++;
            end--;
        }
}
}
