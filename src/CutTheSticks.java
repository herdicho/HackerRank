import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {

        List<Integer> hasilList = new ArrayList<Integer>();
        int pendek = cariBatangPalingPendek(arr);
        boolean cek = cekSemua0(arr);

        while(!cek){
            int potong = 0;
            for (int i=0; i<arr.length; i++){
                if (arr[i] != 0){
                    potong += 1;
                    arr[i] -= pendek;
                }
            }
            hasilList.add(potong);
            pendek = cariBatangPalingPendek(arr);
            cek = cekSemua0(arr);
        }

        int[] hasil = new int[hasilList.size()];
        for (int i=0; i<hasilList.size(); i++)
            hasil[i] = hasilList.get(i);

        return hasil;
    }

    static int cariBatangPalingPendek(int[] arr){

        int pendek = arr[0];
        for (int i=0; i<arr.length; i++){
            if ((arr[i] < pendek && arr[i] != 0) || pendek == 0)
                pendek = arr[i];
        }

        return pendek;
    }

    static boolean cekSemua0(int[] arr){
        int nBatang = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 0)
                nBatang += 1;
        }

        if (nBatang == arr.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nStick = input.nextInt();
        int[] stick = new int[nStick];
        for (int i=0; i<nStick; i++)
            stick[i] = input.nextInt();

        int[] hasil = cutTheSticks(stick);
        for (int i=0; i<hasil.length; i++){
            System.out.println(hasil[i]);
        }
    }
}
