public class zad7 {
    public static void Ceil(int k){
        for (int i = 1; i <= k; i++){
            for (int j = 1; j <= k; j++){
                System.out.print(j+" / "+i+" = "+(j/i)+"\t");
            }
            System.out.println();
        }
    }

    public void zad7() {
        Ceil(9);
    }
}
