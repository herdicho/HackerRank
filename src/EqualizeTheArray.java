import java.util.Scanner;

public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {

        int jumlahKembarBanyak, jumlahKembarBanyakGlobal = 0;

        //cari elemen dengan elemen kembar terbanyak
        for (int i=0; i<arr.length; i++) {
            jumlahKembarBanyak = 0;
            for (int j=0; j<arr.length; j++){
                if (arr[i] == arr[j])
                    jumlahKembarBanyak += 1;
            }
            if (jumlahKembarBanyak > jumlahKembarBanyakGlobal)
                jumlahKembarBanyakGlobal = jumlahKembarBanyak;
        }

        return (arr.length-jumlahKembarBanyakGlobal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArray;
        nArray = input.nextInt();

        int[] array = new int[nArray];
        for(int i=0; i<nArray; i++)
            array[i] = input.nextInt();
        int hasil = equalizeArray(array);
        System.out.println(hasil);
    }
}
