import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        String hasil = "";
        int jarakSkarang, jarakNext;

        do {
            x1 += v1;
            x2 += v2;
            jarakSkarang = Math.abs(x1-x2);
            jarakNext = Math.abs((x1 + v1) - (x2 + v2));
        } while (x1 != x2 && (jarakNext < jarakSkarang));

        if (x1 == x2)
            hasil = "YES";
        else
            hasil = "NO";

        return hasil;

    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int posisi1, posisi2, kecepatan1, kecepatan2;
        String hasil;

        posisi1 = input.nextInt();
        kecepatan1 = input.nextInt();
        posisi2 = input.nextInt();
        kecepatan2 = input.nextInt();

        hasil = kangaroo(posisi1, kecepatan1, posisi2, kecepatan2);
        System.out.println(hasil);
    }

}
