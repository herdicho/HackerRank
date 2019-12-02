import java.util.Scanner;

public class ViralAdvertising {

    static int viralAdvertising(int n) {

        //hitung share skarang, like skarang dan share cumulative
        double shareSkarang = 5, likeSkarang, shareCumulativ = 0;
        for (int i=1; i<=n; i++){
            likeSkarang = Math.floor(shareSkarang/2);
            shareCumulativ += likeSkarang;
            shareSkarang = Math.floor(shareSkarang/2)*3;
        }

        return (int)shareCumulativ;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nDays = input.nextInt();
        int hasil = viralAdvertising(nDays);
        System.out.println(hasil);
    }
}
