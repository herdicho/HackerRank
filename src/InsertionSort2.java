import java.util.Scanner;

public class InsertionSort2 {

    static void insertionSort2(int n, int[] arr) {

        //bandingkan element array per indeks
        for (int i=1; i<n; i++){
            for (int j=i; j>0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            showArray(arr);
        }
    }

    static void showArray(int[] arr){
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArr = input.nextInt();
        int[] arr = new int[nArr];

        for (int i=0; i<nArr; i++)
            arr[i] = input.nextInt();

        insertionSort2(nArr, arr);
    }
}
