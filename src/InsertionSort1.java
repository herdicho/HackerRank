import java.util.Scanner;

public class InsertionSort1 {

    static void insertionSort1(int n, int[] arr) {

        //ambil angka di indeks terakhir
        int lastNumber = arr[n-1];
        //ambil indeks paling akhir - 1
        int indeks = n-2;

        //cek jika lastnumber lebih kecil dari array indeks ke -i
        while (lastNumber <= arr[indeks]){
            arr[indeks+1] = arr[indeks];
            showNewArray(arr);

            if (indeks-1 != -1)
                indeks -= 1;
            else
                break;
        }

        if (indeks != 0 || lastNumber >= arr[0])
            arr[indeks+1] = lastNumber;
        else
            arr[indeks] = lastNumber;
        showNewArray(arr);
    }


    static void showNewArray(int[] arr){
        for (int j=0; j<arr.length; j++)
            System.out.print(arr[j] + " ");
        System.out.println("");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArray = input.nextInt();
        int[] array = new int[nArray];

        for (int i=0; i<nArray; i++){
            array[i] = input.nextInt();
        }

        insertionSort1(nArray, array);
    }
}
