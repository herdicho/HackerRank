import java.util.Scanner;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        int min, max, posMax, posMin;
        min = arr[0];
        max = arr[0];
        posMax = 0;
        posMin = 0;
        int bantu = 1;

        //cari nilai dan posisi indeks nilai maks dan min
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min){
                posMin = i;
                min = arr[i];
            }
            if (arr[i] > max){
                posMax = i;
                max = arr[i];
            }
        }

        //jika nilai maks dan min sama maka ganti posisi indeks maks ke indeks yang berbeda dengan posisi indeks min
        if (max == min){
            for (int i=0; i<arr.length; i++) {
                if (max == arr[i] && i != posMax)
                    posMax = i;
            }
        }

        int[] arrMax = new int[4];
        int[] arrMin = new int[4];

        arrMax[0] = max;
        arrMin[0] = min;

        //tambah 2 array untuk nilai maks dan min
        for (int i=0; i<arr.length; i++) {
            if (i != posMax && i != posMin){
                arrMax[bantu] = arr[i];
                arrMin[bantu] = arr[i];
                bantu++;
            }
        }

        long[] hasil = new long[2];
        long hasilMax = 0, hasilMin = 0;

        //hitung nilai array maks dan min
        for (int i=0; i<arrMax.length; i++)
            hasilMax += arrMax[i];

        for (int i=0; i<arrMax.length; i++)
            hasilMin += arrMin[i];

        hasil[0] = hasilMin;
        hasil[1] = hasilMax;

        for (int i=0; i<hasil.length; i++)
            System.out.print(hasil[i] + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] isian = new int[5];

        for (int i=0; i<isian.length; i++)
            isian[i] = input.nextInt();

        miniMaxSum(isian);
    }
}
