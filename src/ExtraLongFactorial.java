import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

    static void extraLongFactorials(int n) {

        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = n; i >0 ; i--)
            f = f.multiply(BigInteger.valueOf(i));

        System.out.println(f);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        n = input.nextInt();

        extraLongFactorials(n);
    }
}
