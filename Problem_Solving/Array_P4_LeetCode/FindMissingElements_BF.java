package Problem_Solving.Array_P4_LeetCode;

public class FindMissingElements_BF {

    // O(n) -> complexity

    static int[] getMissingElements(int[] arr) {
        int n = arr.length;
        int[] missing = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            Boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                missing[index++] = i;
            }
        }
        return missing;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 4, 5, 2, 2 };
        int[] result = getMissingElements(arr);
        for (int num : result) {
            if (num != 0)
                System.out.print(num + " ");
        }
    }

}
