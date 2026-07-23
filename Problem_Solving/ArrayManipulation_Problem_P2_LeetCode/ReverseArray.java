package Problem_Solving.ArrayManipulation_Problem_P2_LeetCode;

public class ReverseArray {

    // 2 pointer technique
    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int k : arr) {
            System.out.print(k + " , ");
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 9 };
        reverseArray(arr);
    }
}
