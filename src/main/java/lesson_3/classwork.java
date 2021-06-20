package lesson_3;

public class classwork {
    // если значения переменных не обьявлены, то будут значения
    static int a;     //0
    static long l;    //0
    static float f;   //0.0
    static double d;  //0.0
    static boolean b; //false
    static char c;    //0

    public static void main(String[] args) {
//        String[] strings = new String[10];
        String[] strings = {"January", "February", "March"};
        // iter + tab для for each
        // fori + tab для for
        int [][] arr = {
                {1,2,3},
                {4,5,6}
        };
        print2dArray(arr);
    }
    static void print2dArray (int [][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print (arr [y][x] + "  ");
            }
            System.out.println();
        }

    }
}
