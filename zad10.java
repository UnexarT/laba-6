import static java.lang.Math.*;

public class zad10 {
    public static double f(double x) {
        return exp(x*x + 5*x) + 9;
    }
    public void zad10() {
        double resh = 1.371520897744081*pow(10,5);
        double a = 1, b = 2;
        System.out.println("n: \t\t h:\t\t S:\t\t\t\t Абс. решение:\tПогрешность: ");
        for (int n = 10; n <= 10000; n*=10){
            double h = (b - a)/n;
            double sum = 0;
            for (int i = 1; i <= n; i++){
                sum+=f(a+h*i)*h;
            }
            System.out.printf("10^%s\t %s\t %.4f\t %.4f\t",(int) log10(n),h,sum,resh);
            System.out.printf("%.4f",abs((resh - sum)/resh)*100);
            System.out.print("%");
            System.out.println();
        }
    }
}
