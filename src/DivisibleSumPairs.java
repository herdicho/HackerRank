import java.util.Scanner;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {

        int hasil = 0;
        for (int i=0; i<ar.length; i++){
            for (int j=i; j<ar.length; j++){
                if (i != j){
                    if ((ar[i] + ar[j]) % k == 0)
                        hasil += 1;
                }
            }
        }
        return hasil;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nBil, k;
        nBil = input.nextInt();
        k = input.nextInt();

        int[] bilangan = new int[nBil];
        for (int i = 0; i < nBil; i++)
            bilangan[i] = input.nextInt();

        int hasil = divisibleSumPairs(nBil, k, bilangan);
        System.out.println(hasil);
    }
}
