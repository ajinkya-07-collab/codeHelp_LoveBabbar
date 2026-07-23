package Problem_Solving.ArrayManipulation_Problem_P2_LeetCode;

public class ShiftByOnePosition {

    // Right Shift by one position
    static void shiftByOne(int[] arr) {
        // Step 1 : store last wale ki value in temp

        int temp = arr[arr.length - 1];

        // Step 2 : shift all values of array

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        // Step 3 : temp ki value ko 0 index pe copy

        arr[0] = temp;

    }

    static void shiftByK(int[] arr, int k) {
        k = k % arr.length; // Handle k > array length

        for (int i = 0; i < k; i++) {
            shiftByOne(arr);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 1;

        shiftByK(arr, k);
        for (int a : arr) {
            System.out.println(a + " ");
        }

    }

}
