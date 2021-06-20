package lesson_3;

import java.util.Arrays;

public class Third {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0};
        Mass01(arr);
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
}