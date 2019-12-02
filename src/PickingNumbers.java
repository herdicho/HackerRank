import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {

        //cari unique number dari array
        List<Integer> uniqueNumber = new ArrayList<Integer>();

        for (int i=0; i<a.size(); i++){
            int kembar = 0;
            for (int j=0; j<uniqueNumber.size(); j++){
                if (a.get(i) == uniqueNumber.get(j))
                    kembar += 1;
            }
            if (kembar == 0) {
                uniqueNumber.add(a.get(i));
            }
        }

        //hitung jumlah elemen dari masing2 kemungkinan sub kombinasi array
        List<Integer> listElement = new ArrayList<Integer>();
        for (int i=0; i<uniqueNumber.size(); i++){
            int jumlahElementSkarang = 0;
            for (int j=0; j<a.size(); j++){
                if (Math.abs(uniqueNumber.get(i) - a.get(j)) <= 1 && a.get(j) >= uniqueNumber.get(i))
                    jumlahElementSkarang += 1;
            }
            listElement.add(jumlahElementSkarang);
        }

        //cari jumlah elemen terbanyak
        int maxElemen = listElement.get(0);
        for (int i=0; i<listElement.size(); i++){
            if (listElement.get(i) > maxElemen)
                maxElemen = listElement.get(i);
        }

        return maxElemen;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nNumber;
        nNumber = input.nextInt();
        List<Integer> listNumber = new ArrayList<Integer>(nNumber);
        for (int i=0; i<nNumber; i++){
            int number = input.nextInt();
            listNumber.add(number);
        }

        int hasil = pickingNumbers(listNumber);
        System.out.println(hasil);
    }
}
