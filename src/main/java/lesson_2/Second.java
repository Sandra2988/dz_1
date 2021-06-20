package lesson_2;

public class Second {
    public static void main(String[] args) {
        System.out.println(summa(5,6));
        polOrOtr (-10);
        System.out.println(znakChisla(5));
        strNRaz("хорошо", 6);
        System.out.println(godVysokosnyi(300));
    }

    public static boolean summa(int a, int b) {
        int sum = a+b;
        return (sum > 10 && sum <= 20);
    }
    public static void polOrOtr(int a){
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    public static boolean znakChisla(int a) {
        return (a >= 0);
    }
    public static void strNRaz(String a, int b) {
        for (int i =0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean godVysokosnyi(int a) {
        if (a % 400 == 0) {
            return true;
        }
        else if ((a % 100 !=0) && (a % 4 == 0)) {
            return true;
        }
        else return false;
        }
}
