package Problem_Solving.Array_P3;

public class MissingNumber {

    static int getMissingNum(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = { 5, 6, 0, 2, 4, 1, 8, 7 };
        System.out.println("Missing Number is : " + getMissingNum(arr));

    }

}
