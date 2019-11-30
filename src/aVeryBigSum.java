import java.io.*;
import java.util.*;


public class aVeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long hasil = 0;
        for (int i=0; i<ar.length; i++)
            hasil += ar[i];

        return hasil;
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int nCount;
        System.out.print("Input nCount : ");
        nCount = input.nextInt();

        long[] array = new long[nCount];
        for (int i=0; i<array.length; i++)
            array[i] = input.nextInt();

        long hasil;
        hasil = aVeryBigSum(array);
        System.out.println(hasil);

    }
}

