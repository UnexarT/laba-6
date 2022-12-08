import java.util.Scanner;
import static java.lang.Math.*;

public class zad1 {
    public void zad1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите кол-во первых членов ряда:");
        int N = scn.nextInt();
        System.out.println("Введите сравниваемое число M:");
        double M = scn.nextDouble();
        System.out.println("Сумма первых "+N+" членов ряда равна "+SumPervN(N));
        System.out.println("Сумма членов ряда < "+M+" равна "+SumDoM(M));
    }
    public static double SumPervN(int N){
        double count = cos(1) / sin(2);
        double sum = count;
        for (int f = 2; f <= N; f++) {
            count = cos(f) / sin(2 * f);
            sum += count;
        }
        if (1 <= N) {
            return sum;
        } else {
            return 0;
        }
    }

    public static double SumDoM(double M){
        double count = cos(1) / sin(2);
        double sum = 0;
        for (int f = 2; count < M; f++) {
            sum += count;
            count = cos(f) / sin(2 * f);
        }
        return sum;
    }
}
