package Problem_Solving.Array_P4;

public class TwoSum {

    static int[] gettwoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] ans = { arr[i], arr[j] };
                    return ans;
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { -1, -2, -3, -4, -5 };
        int target = -8;

        int[] result = gettwoSum(arr, target);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }

}
