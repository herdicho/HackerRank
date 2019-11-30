import java.io.*;
import java.util.*;


public class DiagonalDifference {

    static long diagonalDifference(List<List<Integer>> arr){
        long hasil1, hasil2, total;

        hasil1 = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
        hasil2 = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);

        for (int i=0; i<arr.size(); i++){
            hasil1 += arr.get(i).get(i);
        }

        int bantu = arr.size()-1;
        for (int i=0; i<arr.size(); i++){
            hasil2 += arr.get(i).get(bantu);
            bantu -=1;
        }

        total = Math.abs(hasil1 - hasil2);

        return total;

    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int nCount;
        int angka;

        System.out.print("Input nCount : ");
        nCount = input.nextInt();

        List<List<Integer>> aList = new ArrayList<List<Integer>>(nCount);

        for (int i=0; i<nCount; i++){
            List<Integer> row = new ArrayList<Integer>(nCount);
            for (int j=0; j<nCount; j++){
                angka = input.nextInt();
                row.add(angka);
            }
            aList.add(row);
        }

        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

        long hasil;
        hasil = diagonalDifference(aList);
        System.out.println(hasil);
    }

}

