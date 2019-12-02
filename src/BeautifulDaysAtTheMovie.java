import java.util.Scanner;

public class BeautifulDaysAtTheMovie {

    static int beautifulDays(int i, int j, int k) {
        int[] normal = new int[(j-i)+1];
        int[] reverse = new int[(j-i)+1];

        //simpan tanggal normal ke dalam array
        int skarang = i;
        for (int z=0; z<=(j-i); z++){
            normal[z] = skarang;
            skarang += 1;
        }

        //simpan tanggal reverse ke dalam array
        String angkaRev;
        for (int z=0; z<normal.length; z++){
            String angka = String.valueOf(normal[z]);
            angkaRev = "";
            for (int y=angka.length()-1; y>=0; y--)
                angkaRev += angka.charAt(y);
            reverse[z] = Integer.valueOf(angkaRev);
        }

        //hitung beautiful days
        int totalBeautiful = 0;
        for (int z=0; z<normal.length; z++){
            if (Math.abs(normal[z] - reverse[z]) % k == 0)
                totalBeautiful += 1;
        }
        return totalBeautiful;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstDay, lastDay, pembagi;
        firstDay = input.nextInt();
        lastDay = input.nextInt();
        pembagi = input.nextInt();

        int hasil = beautifulDays(firstDay, lastDay, pembagi);
        System.out.println(hasil);
    }
}
