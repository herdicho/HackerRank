import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeetwenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> faktor = new ArrayList<Integer>();
        int hasil = 0;

        // cari elemen terbesar di array b
        int bBesar = b.get(b.size()-1);
        for (int i=0; i<b.size(); i++){
            if (b.get(i) > bBesar)
                bBesar = b.get(i);
        }

        //cari semua faktor dari elemen array b terbesar
        for (int i=1; i<=bBesar; i++){
            if (bBesar % i == 0)
                faktor.add(i);
        }

        //cari faktor yang memenuhi 2 kriteria soal (dengan cek ke masing2 elemen di kedua array)
        int betulPerElemen;
        for (int i=0; i<faktor.size(); i++){
            betulPerElemen = 0;
            //cek kriteria di array A
            for (int j=0; j<a.size(); j++){
                if (faktor.get(i) % a.get(j) == 0)
                    betulPerElemen += 1;
            }
            //cek kriteria di array B
            for (int j=0; j<b.size(); j++){
                if (b.get(j) % faktor.get(i) == 0)
                    betulPerElemen += 1;
            }
            if (betulPerElemen == (a.size() + b.size()))
                hasil += 1;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArrX, nArrY, angka;
        nArrX = input.nextInt();
        nArrY = input.nextInt();

        List<Integer> arrX = new ArrayList<Integer>(nArrX);
        List<Integer> arrY = new ArrayList<Integer>(nArrY);

        for (int i=0; i<nArrX; i++){
           angka = input.nextInt();
           arrX.add(angka);
        }

        for (int i=0; i<nArrY; i++){
            angka = input.nextInt();
            arrY.add(angka);
        }

        int hasil = getTotalX(arrX, arrY);
        System.out.println(hasil);
    }
}
