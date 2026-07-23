package Problem_Solving.ArrayManipulation_Problem_P2;

import java.util.HashMap;

public class HighestFrequncyElement_Mode {

    // using HashMap because we require Key-Value Pair of Number -> Frequency
    static int getMode(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i : freq.keySet()) {
            // i -> will represent key
            // Keyset() > returns set of keys in map

            System.out.println(i + " -> " + freq.get(i));
        }
        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyKifrequency = freq.get(key);
            if (currentKeyKifrequency > maxFreq) {
                maxFreq = currentKeyKifrequency;
                maxFreqWaliKey = currentKey;
            }

        }
        return maxFreqWaliKey;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
        int mode = getMode(arr);
        System.out.println(mode);

    }

}
