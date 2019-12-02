import java.util.Scanner;

public class ElectronicsShop {

    static long getMoneySpent(long[] keyboards, long[] drives, long b) {

        //belum

        //hitung semua kombinasi harga barang
        long maxHarga = keyboards[0] + drives[0];
        for (int i=0; i<keyboards.length; i++){
            for (int j=0; j<drives.length; j++){
                if ((keyboards[i] + drives[j]) > maxHarga && (keyboards[i] + drives[j]) <= b)
                    maxHarga = keyboards[i] + drives[j];
            }
        }

        if (maxHarga > b)
            maxHarga = -1;

        return maxHarga;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int money, nKeyboard, nDrive;
        money = input.nextInt();
        nKeyboard = input.nextInt();
        nDrive = input.nextInt();

        long[] keyboardPrice = new long[nKeyboard];
        for (int i=0; i<nKeyboard; i++)
            keyboardPrice[i] = input.nextLong();

        long[] drivePrice = new long[nDrive];
        for (int i=0; i<nDrive; i++)
            drivePrice[i] = input.nextLong();

        long hasil = getMoneySpent(keyboardPrice, drivePrice, money);
        System.out.println(hasil);
    }
}
