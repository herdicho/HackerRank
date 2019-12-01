import java.util.Scanner;

public class DayOfTheProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int february = 0, totalDay;

        //cari apakah inputan tahun di february kabisat sesuai kriteria soal dan sesuai tahun penggunaan julian dan gregorian calendar
        if (year >= 1700 && year <= 1917){
            if (year % 4 == 0)
                february = 29;
            else
                february = 28;
        } else if (year == 1918){
            february = 29 - 14;
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                february = 29;
            else
                february = 28;
        }

        //hitung hari berdasarkan kriteria soal
        totalDay = 256 - (31 + february + 31 + 30 + 31 + 30 + 31 + 31);
        String hasil = String.valueOf(totalDay)+".09."+String.valueOf(year);

        return hasil;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        year = input.nextInt();

        String date = dayOfProgrammer(year);
        System.out.println(date);
    }
}
