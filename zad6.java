import java.util.Scanner;

public class zad6 {
    public void zad6() {
        Scanner scn = new Scanner(System.in);
        Oblast oblast = new Oblast();
        int i = 1;
        while (i == 1) {
            System.out.println("Задайте Х:");
            double x = scn.nextDouble();
            System.out.println("Задайте Y:");
            double y = scn.nextDouble();
            oblast.setX(x);
            oblast.setY(y);
            if (oblast.Oblast()) {
                System.out.println("Попадание в закрашенную область");
            } else {
                System.out.println("Точка не попала");
            }
            System.out.println("Хотите проверить другую точку?");
            i = -1;
            while (i != 1 && i != 0) {
                System.out.println("Если да - 1, иначе - 0");
                i = scn.nextInt();
            }
        }
    }
}
