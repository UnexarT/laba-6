import java.util.Random;

public class zad2 {
    public void zad2() {
        Random rnd = new Random();
        int x = Math.abs(rnd.nextInt())+1;
        int z = x;
        int max = 0;
        int num = 1;
        while (z >= 1) {
            int i = 0;
            int c = z;
            while (c >= 1) {
                if (z % 10 == c % 10) {
                    i++;
                }
                c /= 10;
            }
            if (z % 10 > num) {
                num = z % 10;
                max = i;
            }
            z /= 10;
        }
        System.out.println("В числе " + x + " максимальная цифра " + num);
        System.out.println("Цифра " + num + " встречается " + max + " раз(а)");
        System.out.println("Факториал от " + max + " равен " + Fact(max));
    }
    public static int Fact(int b){
        int i = 1;
        for (int f = 2; f <= b; f++){
            i *= f;
        }
        return i;
    }
}
