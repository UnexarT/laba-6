import java.util.Scanner;

public class zad4 {
    public static int Perevod(int x,int y) {
        int c = Math.abs(x);
        String num = "";
        while (c > 0) {
            num =  c % y + num;
            c /= y;
        }
        if (x<0){
            c = Integer.parseInt(num)*-1;
        } else {
            c = Integer.parseInt(num);
        }
        return c;
    }
    public static boolean Proverka(int x, int y, int z){
        int i = -1;
        int c = Math.abs(x);
        int num = 0;
        while(c>0){
            i++;
            num += (c%10)*Math.pow(y,i);
            c /= 10;
        }
        if (x<0){
            num = num*-1;
        }
        return num==z;
    }

    public void zad4() {
        Scanner scn = new Scanner(System.in);
        int fl = 1;
        while (fl == 1) {
            System.out.println("Введите целое десятичное число для перевода:");
            int x = scn.nextInt();
            int y = 0;
            while (y < 2 || y > 10) {
                System.out.println("Введите систему исчисления для перевода в диапазоне [2,10]:");
                y = scn.nextInt();
            }
            System.out.println("Результат: "+Perevod(x,y));
            if (Proverka(Perevod(x,y),y,x)) {
                System.out.println("В десятичной = "+ x+" - верно");
            } else {
                System.out.println("В десятичной != "+ x+" - неверно");
            }
            System.out.println("Хотите продолжить перевод? 1 - Да, 2 - Нет");
            fl = scn.nextInt();
        }
    }
}
