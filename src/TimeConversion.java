import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        char aOrp, firstHour, secondHour;
        String stringFirstHour, stringSecondHour, firstSecondHour = "";
        int intFirstSecondHour;

        //ambil semua string jam, menit, detik tanpa AM/PM
        char[] time = new char[8];
        for (int i=0; i<8; i++)
            time[i] = s.charAt(i);

        //ambil char indeks ke 8 untuk mendapatkan AM / PM
        aOrp = s.charAt(8);

        //ambil 2 indeks awal yaitu jam
        firstHour = s.charAt(0);        //ambil indeks 1 berupa char
        secondHour = s.charAt(1);
        stringFirstHour = String.valueOf(firstHour);       //rubah indeks 1 kembali ke string
        stringSecondHour = String.valueOf(secondHour);
        firstSecondHour = stringFirstHour + stringSecondHour;       //gabung kedua indeks yang sudah kembali string
        intFirstSecondHour = Integer.parseInt(firstSecondHour);        //rubah integer untuk cek apakah < 12 atau > 12

        if (aOrp == 'P' && intFirstSecondHour < 12){
            intFirstSecondHour += 12;

            firstSecondHour = String.valueOf(intFirstSecondHour);
            time[0] = firstSecondHour.charAt(0);
            time[1] = firstSecondHour.charAt(1);
        }

        if (aOrp == 'A' && intFirstSecondHour == 12){
                time[0] = '0';
                time[1] = '0';
        }

        String timeFix = String.valueOf(time);
        return timeFix;
    }

    public static void main(String[] args) throws IOException {
       Scanner input = new Scanner(System.in);
        String waktu = input.nextLine();

        String result = timeConversion(waktu);
        System.out.println(result);

    }
}
