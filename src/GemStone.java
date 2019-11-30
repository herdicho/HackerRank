import java.util.ArrayList;
import java.util.Scanner;

public class GemStone {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        int ada, nTotal, hasil = 0;
        ArrayList<String> uniqueAlphabet = new ArrayList<String>();

        //get all unique character dari array 1
        for (int i=0; i<arr[0].length(); i++){
            ada = 0;
            for (int j=0; j<uniqueAlphabet.size(); j++){
                if (uniqueAlphabet.get(j).equals(String.valueOf(arr[0].charAt(i))))
                    ada +=1;
            }
            if (ada == 0)
                uniqueAlphabet.add(String.valueOf(arr[0].charAt(i)));
        }

        //cek semua unique character di array 1 ke array lainnya
        for (int i=0; i<uniqueAlphabet.size(); i++){
            nTotal = 0;
            for (int j=0; j<arr.length; j++){
                for (int k=0; k<arr[j].length(); k++){
                    if (uniqueAlphabet.get(i).equals(String.valueOf(arr[j].charAt(k)))){
                        nTotal +=1;
                        break;
                    }
                }
            }
            if (nTotal == arr.length)
                hasil += 1;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nGem, hasilGem;
        nGem = input.nextInt();

        String[] gem = new String[nGem];
        for (int i=0; i<nGem; i++)
            gem[i] = input.next();


        hasilGem = gemstones(gem);
        System.out.println(hasilGem);

    }
}
