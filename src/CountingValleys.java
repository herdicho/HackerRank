import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        //inisiasi hasil valley yg terbentuk dan posisi awal pendaki
        int hasil = 0, posisiSkarang = 0;
        for (int i=0; i<n; i++){
            //inisiasi posisi sebelum perubahan posisi baru
            int posisiSebelum = posisiSkarang;

            //jika posisi baru = U maka posisiSkarang +1
            if (s.charAt(i) == 'U')
                posisiSkarang+=1;
            //jika posisi baru = D maka posisiSkarang -1
            else
                posisiSkarang-=1;

            //jika posisiSkarang kembali ke 0 (posisi awal) dan posisi sebelumnya < 0 (berarti valley bukan gunung karena posisi < 0)
            if (posisiSkarang == 0 && posisiSebelum < 0)
                hasil += 1;
        }

        return hasil;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nStep = input.nextInt();
        String pathString = input.next();
        int hasil = countingValleys(nStep, pathString);
        System.out.println(hasil);

    }
}
