import java.util.Scanner;

public class CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {

        //hitung jarak ke dua kucing dan tikus
        int jarakCat1toMouse = Math.abs(z - x);
        int jarakCat2toMouse = Math.abs(z - y);

        //cari kucing terdekat dengan tikus
        String hasil = "";
        if (jarakCat1toMouse < jarakCat2toMouse)
            hasil = "Cat A";
        if (jarakCat2toMouse < jarakCat1toMouse)
            hasil = "Cat B";
        if (jarakCat1toMouse == jarakCat2toMouse)
            hasil = "Mouse C";

        return hasil;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int nPercobaan = input.nextInt();

        for (int i=0; i<nPercobaan; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();

            String hasil = catAndMouse(x, y, z);
            System.out.println(hasil);
        }
    }
}
