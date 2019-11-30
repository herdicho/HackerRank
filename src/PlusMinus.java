import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double nPos = 0, nNeg = 0, n0 = 0;
        double percenPos, percenNeg, percen0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] > 0)
                nPos +=1;
            if (arr[i] < 0)
                nNeg +=1;
            if (arr[i] == 0)
                n0 +=1;
        }

        percenPos = nPos / arr.length;
        percenNeg = nNeg / arr.length;
        percen0 = n0 / arr.length;

        System.out.println(percenPos);
        System.out.println(percenNeg);
        System.out.println(percen0);

    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int nNumber;
    nNumber = input.nextInt();

    int[] number = new int[nNumber];
    for (int i=0; i<nNumber; i++)
        number[i] = input.nextInt();

    plusMinus(number);
    }
}
