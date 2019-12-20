import java.util.Scanner;

public class MinimumDistances {

    static int minimumDistances(int[] array) {
        int hasilGlobal = -1;
        int hasilSkarang = 0;
        int indeksAwal, indeksAkhir = 0;

        for (int i=0; i<array.length; i++){
            int kembar = 0;
            indeksAwal = i;
            for (int j=0; j<array.length; j++){
                if (i!=j && array[j] == array[i]){
                    System.out.println("masuk");
                    kembar+=1;
                    indeksAkhir = j;
                }
            }
            if (kembar == 1) {
                hasilSkarang = hitungDistance(indeksAwal, indeksAkhir);
                if (hasilGlobal == -1)
                    hasilGlobal = hasilSkarang;
                else {
                    if (hasilSkarang < hasilGlobal)
                        hasilGlobal = hasilSkarang;
                }
            }
        }
        return hasilGlobal;
    }

    static int hitungDistance(int t1, int t2){
        return Math.abs(t2-t1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArray = input.nextInt();
        int[] array = new int[nArray];
        for (int i=0; i<nArray; i++)
            array[i] = input.nextInt();

        int hasil = minimumDistances(array);
        System.out.println(hasil);

    }
}
