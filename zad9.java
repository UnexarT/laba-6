import java.util.Scanner;
import static java.lang.Math.*;

public class zad9 {
    public static double Newton(double y, double p, double x) {
        return ((p-1)*y + x/pow(y,p-1))/p;
    }
    public void zad9() {
         Scanner scn = new Scanner(System.in);
        System.out.println("Введите подкоренное число больше нуля: ");
        double x = scn.nextDouble();
        if (x<0){
            System.out.println("Под корнем не может быть отрицательного числа");
            System.out.println("Взят модуль от данного числа");
            x = abs(x);
        }
        System.out.println("Введите степень корня: ");
        double p = scn.nextDouble();
        System.out.println("Точность:\t Корень:\t  Число итераций:\t");
        for (int i = 2; i <=6; i++) {
            double y = exp(log(x * (p + 1)) / p) - 0.1;
            double e = pow(10, -i);
            int c = 0;
            while(abs(y-Newton(y,p,x)) > e) {
                c++;
                y = Newton(y, p, x);
            }
            System.out.printf(" %s\t %s\t  %s\t", e, y, c);
            System.out.println();
        }
    }
}
