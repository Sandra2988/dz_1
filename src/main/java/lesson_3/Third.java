package lesson_3;

public class Third {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0};
        mass01(arr);
        System.out.println();
        massZapolnit();
        System.out.println();
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        massMenee6UmnozitNa2(arr2);
        System.out.println();
        diagonalyna1();
        int len = 5;
        int initialValue = 3;
        System.out.println();
        dlinaKajdoiYacheiki(len,initialValue);
    }

    static void mass01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + "  ");
        }
    }

    static int[] massZapolnit() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + "  ");
        }
        return arr;
    }

    static int[] massMenee6UmnozitNa2(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + "  ");
        }
        return arr2;
    }

    static int[][] diagonalyna1() {
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (i == j) {
                    arr3[i][j] = 1;
                    }
                System.out.print(arr3[i][j] + "  ");
            }
            System.out.println();
        }
        return arr3;
    }
    static int[] dlinaKajdoiYacheiki(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + "  ");
        }
        return arr;
    }
}