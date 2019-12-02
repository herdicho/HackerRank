import java.util.Scanner;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c, int k) {
        int health = 100;
        int posisi = 0;

        do {
            posisi += k;
            if (posisi > c.length-1)
                posisi -= c.length;

            if (c[posisi] == 1)
                health -= 3;
            else
                health -= 1;
        } while (posisi != 0);

        return health;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nCloud, jump;
        nCloud = input.nextInt();
        jump = input.nextInt();

        int[] cloudKind = new int[nCloud];
        for (int i=0; i<nCloud; i++)
            cloudKind[i] = input.nextInt();

        int hasil = jumpingOnClouds(cloudKind, jump);
        System.out.println(hasil);

    }
}
