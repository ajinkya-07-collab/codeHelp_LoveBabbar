package Problem_Solving.Array_P3_LeetCode;

public class SortZeroesOnesOptimsied {

    // using 2 pointer (i.e,swap)

    static int[] getSorted(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                // int temp = arr[i];
                // arr[i] = arr[j];
                // arr[j] = temp;
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 1, 0, 0, 1, 1 };
        getSorted(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
