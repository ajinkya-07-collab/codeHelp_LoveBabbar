package Problem_Solving.Array_P3;

public class SortZeroesOnesBF {

    static void sort(int[] arr) {
        int countZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }

        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1 };
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
