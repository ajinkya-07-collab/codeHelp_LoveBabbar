package Problem_Solving.Array_P3_LeetCode;

import java.util.HashMap;

public class UniqueElement {

    static int getUniqueElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        for (int i : map.keySet()) {
            // i -> will represent key
            // Keyset() > returns set of keys in map

            System.out.println(i + " -> " + map.get(i));
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 3, 5, 4, 5, 3, 4 };
        System.out.println("Unique Element : " + getUniqueElement(nums));
    }

}
