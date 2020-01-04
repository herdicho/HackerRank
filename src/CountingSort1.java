import java.util.Scanner;

public class CountingSort1 {

    static int[] countingSort(int[] arr) {
        //cari max value
        int maxValue = findMaxValue(arr);

        //inisiasi array awal sebanyak nilai tertinggi dari array
        int[] wadahArray = new int[maxValue+1];

        //isi wadah array sesuai array inputan indeks ke-i
        for (int i=0; i<arr.length; i++){
            wadahArray[arr[i]] += 1;
        }

        return wadahArray;
    }

    static int findMaxValue(int[] arr){
        int max = arr[0];

        //cari nilai max array yang diinput
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArr = input.nextInt();
        int[] arr = new int[nArr];

        for (int i=0; i<nArr; i++)
            arr[i] = input.nextInt();

        int[] hasil = countingSort(arr);
        for (int i=0; i<hasil.length; i++)
            System.out.print(hasil[i] + " ");
    }
}
