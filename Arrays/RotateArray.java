public class RotateArray {

    // Method to rotate array to the right by k steps
    static void rotateRight(int[] arr, int k) {
        int n = arr.length;

        // If k is greater than array size
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse array elements
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;

        rotateRight(arr, k);

        // Print rotated array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
