package Problem_Solving.Array_P4_LeetCode;

public class PivotIndexOptimised {

    static int getPivotIndex(int[] arr) {

        int n = arr.length;

        int[] leftSum = new int[n];
        int[] rightsum = new int[n];

        // fill left sum wala array
        leftSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i];
        }

        // fill right sum wala array
        rightsum[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightsum[i]) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 7, 3, 6, 5, 6 };
        System.out.println(getPivotIndex(arr));
    }

}
