import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quicksort1 {

    static int[] quickSort(int[] arr) {

        //inisiasi pivot = elemen ke 0 dari array
        int pivot = arr[0];
        // inisiasi wadah untuk left, equal, right
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> equal = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        //bandingkan element array per indeks
        for (int i=1; i<arr.length; i++){
            if (arr[i]<pivot)
                left.add(arr[i]);
            else
                right.add(arr[i]);
        }

        equal.add(pivot);

        //gabungkan arraylist left, equal, right ke satu array hasil
        int[] hasil = new int[arr.length];
        hasil = tambahArray(left, hasil, 0);
        hasil = tambahArray(equal, hasil, left.size());
        hasil = tambahArray(right, hasil, equal.size()+left.size());

        return hasil;
    }

    static int[] tambahArray(List<Integer> arr, int[] hasil, int indeksSkarang){
        for (int i=0; i<arr.size(); i++){
            hasil[indeksSkarang] = arr.get(i);
            indeksSkarang += 1;
        }

        return hasil;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nArr = input.nextInt();
        int[] arr = new int[nArr];

        for (int i=0; i<nArr; i++)
            arr[i] = input.nextInt();

        int[] hasil = quickSort(arr);
        for (int i=0; i<hasil.length; i++)
            System.out.print(hasil[i] + " ");
    }
}
