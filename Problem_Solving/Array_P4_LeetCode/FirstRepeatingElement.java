package Problem_Solving.Array_P4_LeetCode;

import java.util.HashMap;

public class FirstRepeatingElement {

    static int getFirstRepeatedELememnt(int[] arr) {

        // int n = arr.length;

        // for (int i = 0; i < n - 1; i++) {
        // for (int j = i + 1; j < n; j++) {
        // if (arr[i] == arr[j]) {
        // return arr[i];

        // }
        // }
        // }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        System.out.println(getFirstRepeatedELememnt(arr));
    }
}
