import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        //inisiasi hasil awal berupa huruf a = 0
        long hasil = 0;

        //cari huruf a di string awal
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a')
                hasil += 1;
        }

        long panjangString = s.length();

        //kalikan hasil dengan total perulangan yang sempurna
        long perulangan = n/panjangString;
        hasil *= perulangan;

        long sisaPerulangan = n%panjangString;
        //tambahkan hasil untuk sisa perulangan word yang tidak sempurna
        for (int i=0; i<sisaPerulangan; i++){
            if (s.charAt(i) == 'a')
                hasil += 1;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        long wordLength = input.nextLong();

        long hasil = repeatedString(word, wordLength);
        System.out.println(hasil);

    }
}
