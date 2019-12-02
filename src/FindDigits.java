import java.util.Scanner;

public class FindDigits {

    static int findDigits(int n) {

        String number = String.valueOf(n);
        int[] arrayNumber = new int[number.length()];
        for (int i=0; i<number.length(); i++)
            arrayNumber[i] = Integer.valueOf(String.valueOf(number.charAt(i)));

        int pembagi = 0;
        for (int i=0; i<arrayNumber.length; i++){
            if (arrayNumber[i] != 0){
                if (n % arrayNumber[i] == 0)
                    pembagi += 1;
            }
        }

        return pembagi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nSample = input.nextInt();
        for (int i=0; i<nSample; i++) {
            int number = input.nextInt();
            int hasil = findDigits(number);
            System.out.println(hasil);
        }

    }
}
