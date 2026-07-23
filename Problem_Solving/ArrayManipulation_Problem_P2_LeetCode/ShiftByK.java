package Problem_Solving.ArrayManipulation_Problem_P2;

public class ShiftByK {

    static void shiftByK(int[] arr, int k) {

        int n = arr.length;
        k = k % n; // Handles k greater than array length

        for (int j = 0; j < k; j++) {

            // Shift by one position
            int temp = arr[n - 1];

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        shiftByK(arr, 2);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
