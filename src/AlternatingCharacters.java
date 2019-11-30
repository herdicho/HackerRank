import java.util.Scanner;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int hapus = 0;

        for (int i=0; i<s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1))
                hapus += 1;
        }

        return hapus;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nString, hasil;
        nString = input.nextInt();

        int[] arrayHasil = new int[nString];

        for (int i=0; i<nString; i++){
            String kata = input.next();
            hasil = alternatingCharacters(kata);
            arrayHasil[i] = hasil;
        }

        for (int i=0; i<arrayHasil.length; i++)
            System.out.println(arrayHasil[i]);
    }
}
