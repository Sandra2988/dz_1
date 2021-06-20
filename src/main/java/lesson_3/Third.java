package lesson_3;

import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0};
        Mass01(arr);
        System.out.println();
        MassZapolnit();
    }

    static void Mass01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + "  ");
        }
    }

    static int[] MassZapolnit() {
        int[] arr2 = new int[100];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.print(arr2[i] + "  ");
        }
       return arr2;
        }

}