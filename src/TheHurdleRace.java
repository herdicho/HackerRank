import java.util.Scanner;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {

        //cari hurdles tertinggi
        int maxHeightHurdles = height[0];
        for (int i=0; i<height.length; i++) {
            if (height[i] > maxHeightHurdles)
                maxHeightHurdles = height[i];
        }

        //bandingkan hurdles tertinggi dan max lompatan normal
        int potion = 0;
        if (maxHeightHurdles <= k)
            potion = 0;
        else
            potion = maxHeightHurdles - k;

        return potion;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nHurdles = input.nextInt();
        int heightNormal = input.nextInt();
        int[] heightHurdles = new int[nHurdles];

        for (int i=0; i<nHurdles; i++)
            heightHurdles[i] = input.nextInt();

        int hasil = hurdleRace(heightNormal, heightHurdles);
        System.out.println(hasil);
    }
}
