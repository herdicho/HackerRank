import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        List<List<Integer>> uniqueBird = new ArrayList<List<Integer>>(arr.size());

        /*cari unique bird and assign ke array 2 dimensi
        (format array 2 dimensi)
        int unique bird |jumlah bird awal
        1               |0
        2               |0
        5               |0
        .               |0
        .               |0
         */
        for (int i=0; i<arr.size(); i++){
            int kembar = 0;
            for (int j=0; j<uniqueBird.size(); j++){
                if (arr.get(i) == uniqueBird.get(j).get(0))
                    kembar += 1;
            }
            if (kembar == 0){
                ArrayList<Integer> bird = new ArrayList<Integer>(2);
                bird.add(arr.get(i));
                bird.add(0);
                uniqueBird.add(bird);
            }
        }

        //kelompokkan dan hitung bird per tipe sesuai yang diinputkan
        for (int i=0; i<arr.size(); i++){
            for (int j=0; j<uniqueBird.size(); j++){
                if (arr.get(i) == uniqueBird.get(j).get(0)){
                    int skarang = uniqueBird.get(j).get(1) + 1;
                    uniqueBird.get(j).set(1, skarang);
                }
            }
        }

        //cari jumlah burung terbanyak
        int nCommonBird = uniqueBird.get(0).get(1);
        List<Integer> mostCommonBird = new ArrayList<Integer>();

        for (int i=0; i<uniqueBird.size(); i++){
            if (uniqueBird.get(i).get(1) >= nCommonBird){
                nCommonBird = uniqueBird.get(i).get(1);
            }
        }

        //cari burung jika jumlah terbanyak lebih dari 1 burung
        for (int i=0; i<uniqueBird.size(); i++){
            if (uniqueBird.get(i).get(1) == nCommonBird)
                mostCommonBird.add(uniqueBird.get(i).get(0));
        }

        //cari bird unique terkecil dari n bird terbanyak
        int lowestBird = mostCommonBird.get(0);

        for (int i=0; i<mostCommonBird.size(); i++){
            if (mostCommonBird.get(i) < lowestBird)
                lowestBird = mostCommonBird.get(i);
        }

    return lowestBird;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nBirds;
        nBirds = input.nextInt();

        List<Integer> birds = new ArrayList<Integer>(nBirds);
        for (int i=0; i<nBirds; i++){
            int bird = input.nextInt();
            birds.add(bird);
        }

        int hasil = migratoryBirds(birds);
        System.out.println(hasil);
    }

}
