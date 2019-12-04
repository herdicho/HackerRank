import java.util.Scanner;

public class JumpingOnTheClouds2 {

    static int jumpingOnClouds(int[] c) {
        int nLoncat = 0;
        int posisi = 0;
        int loncat;

        do {
            //fungsi untuk loncat yang bisa dilakukan
            loncat = cekLoncat(posisi, c);
            posisi += loncat;
            nLoncat += 1;
        } while (posisi+1 != c.length);

        return nLoncat;

    }

    static int cekLoncat(int pos, int[] c) {
        int loncat = 0;

        if ((pos + 2) + 1 <= c.length && c[pos+2] != 1) {
            loncat += 2;
        } else if ((pos + 1) + 1 <= c.length && c[pos+1] != 1){
            loncat += 1;
        }

        return loncat;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nClouds = input.nextInt();
        int[] clouds = new int[nClouds];
        for (int i=0; i<nClouds; i++)
            clouds[i] = input.nextInt();

        int hasil = jumpingOnClouds(clouds);
        System.out.println(hasil);
    }
}
