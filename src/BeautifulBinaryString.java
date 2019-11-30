import java.util.Scanner;

public class BeautifulBinaryString {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {

        int nUbah = 0;
        char[] charB = new char[b.length()];

        for (int i=0; i<b.length(); i++)
            charB[i] = b.charAt(i);

        for (int i=1; i<b.length()-1; i++){
            if (charB[i-1] == '0' && charB[i] == '1' && charB[i+1] == '0'){
                nUbah += 1;
                charB[i+1] = 1;
            }
        }

        return nUbah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nString;
        nString = input.nextInt();

        String kata;
        kata = input.next();

        int hasil = beautifulBinaryString(kata);
        System.out.println(hasil);
    }


}
