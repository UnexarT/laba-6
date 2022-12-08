import static java.lang.Math.*;

public class zad3 {
    public static void SumSum() {
        double sum1 = 0;
        for (int i = 1; i <= 8; i++){
            double sum2 = 0;
            for (int j = 1; j<=i; j++){
                sum2 += pow(pow(j,cos(i)) + pow(i,cos(j)),2);
            }
            sum1 += sum2;
        }
        System.out.println("Первое выражение равно "+sum1);
    }
    public static void ProdProd() {
        double prod1 = 1;
        for (int i = 1; i <= 5; i++){
            double prod2 = 1;
            for (int j = 1; j<=i; j++){
                prod2 *= sin(pow(j,cos(i)));
            }
            prod1 *= prod2;
        }
        System.out.println("Второе выражение равно "+prod1);
    }
    public static void ProdSumSum() {
        double prod = 1;
        for (int i = 1; i <= 8; i++){
            double sum1 = 0;
            for (int j = i; j <= 2*i - 1; j++){
                double sum2 = 0;
                for (int k = i+j; k<=2*(i+j); k++){
                    sum2 += 2*cos(j) - 3*log(i + 0.5*k);
                }
                sum1 += sum2;
            }
            prod *= sum1;
        }
        System.out.println("Третье выражение равно "+prod);
    }
    public void zad3() {
        SumSum();
        ProdProd();
        ProdSumSum();
    }
}

