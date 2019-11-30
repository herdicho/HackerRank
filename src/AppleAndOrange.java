import java.util.Scanner;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges, int nApel, int nJeruk) {
        int[] hasilApel = new int[nApel];
        int[] hasilJeruk = new int[nJeruk];
        int nApelFix = 0, nJerukFix = 0;

        for (int i=0; i<nApel; i++)
            hasilApel[i] = a + apples[i];

        for (int i=0; i<nJeruk; i++)
            hasilJeruk[i] = b + oranges[i];

        for (int i=0; i<nApel; i++) {
            if (hasilApel[i] >= s && hasilApel[i] <= t)
                nApelFix += 1;
        }

        for (int i=0; i<nJeruk; i++) {
            if (hasilJeruk[i] >= s && hasilJeruk[i] <= t)
                nJerukFix += 1;
        }

        System.out.println(nApelFix);
        System.out.println(nJerukFix);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarakAwal, jarakAkhir, lokasiApel, lokasiJeruk, nApel, nJeruk;

        jarakAwal = input.nextInt();
        jarakAkhir = input.nextInt();
        lokasiApel = input.nextInt();
        lokasiJeruk = input.nextInt();
        nApel = input.nextInt();
        nJeruk = input.nextInt();

        int[] apple = new int[nApel];
        int[] jeruk = new int[nJeruk];

        for (int i=0; i<nApel; i++)
            apple[i] = input.nextInt();

        for (int i=0; i<nJeruk; i++)
            jeruk[i] = input.nextInt();

        countApplesAndOranges(jarakAwal, jarakAkhir, lokasiApel, lokasiJeruk, apple, jeruk, nApel, nJeruk);

    }
}
