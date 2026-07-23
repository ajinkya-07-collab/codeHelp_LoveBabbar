package Problem_Solving.ArrayManipulation_Problem_P2;

public class ExtremeElements {

    // print extreme elements in alternate manner

    public static void printAltrnate(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                // i < j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printAltrnate(arr);
    }

}
