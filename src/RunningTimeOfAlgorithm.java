import java.util.Scanner;

public class RunningTimeOfAlgorithm {

    static int runningTime(int[] arr) {

        //bandingkan element array per indeks dan hitung pergeseran nilai array
        int geser = 0;

        for (int i=1; i<arr.length; i++){
            for (int j=i; j>0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    geser += 1;
                }
            }
        }

        return geser;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nArr = input.nextInt();
        int[] arr = new int[nArr];

        for (int i=0; i<nArr; i++)
            arr[i] = input.nextInt();

        int hasil = runningTime(arr);
        System.out.println(hasil);
    }
}
