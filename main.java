import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fl = 1;
        while (fl == 1) {
            System.out.println("Введите номер задания(1-10) для получения ответа: ");
            int x = scn.nextInt();
            switch (x) {
                case 1:
                    zad1 z1 = new zad1();
                    z1.zad1();
                    break;
                case 2:
                    zad2 z2 = new zad2();
                    z2.zad2();
                    break;
                case 3:
                    zad3 z3 = new zad3();
                    z3.zad3();
                    break;
                case 4:
                    zad4 z4 = new zad4();
                    z4.zad4();
                    break;
                case 5:
                    System.out.println("Задания нет");
                    ;
                    break;
                case 6:
                    zad6 z6 = new zad6();
                    z6.zad6();
                    break;
                case 7:
                    zad7 z7 = new zad7();
                    z7.zad7();
                    break;
                case 8:
                    zad8 z8 = new zad8();
                    z8.zad8();
                    break;
                case 9:
                    zad9 z9 = new zad9();
                    z9.zad9();
                    break;
                case 10:
                    zad10 z10 = new zad10();
                    z10.zad10();
                    break;
            }
            System.out.println("Хотите проверить другие задания? Да - 1, нет - 2");
            fl = scn.nextInt();
        }
    }
}
