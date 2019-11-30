import java.io.IOException;
import java.util.Scanner;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        int max = ar[0];
        int nMax = 0;

        //cari nilai max
        for (int i=0; i<ar.length; i++){
            if (ar[i] > max)
                max = ar[i];
        }

        //car jumlah nilai max
        for (int i=0; i<ar.length; i++){
            if (max == ar[i])
                nMax +=1;
        }

        return nMax;
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int nCandles;
        nCandles = input.nextInt();

        int[] heightCandle = new int[nCandles];
        for (int i=0; i<nCandles; i++)
            heightCandle[i] = input.nextInt();

        int hasil;
        hasil = birthdayCakeCandles(heightCandle);

        System.out.println(hasil);

    }
}
