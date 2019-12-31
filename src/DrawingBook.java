import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrawingBook {

    static int pageCount(int n, int p) {
        int turnFromFrontPage = 0, turnFromBackPage = 0;

        //buat array 2 dimensi yang menyerupai book sebanyak total page (n)
        List<int[]> book = new ArrayList<>();
        for (int i=0; i<=n; i+=2){
           book.add(new int[]{i, i+1});
        }

        //hitung ganti halaman dari depan
        for (int i=0; i<book.size(); i++){
            if (book.get(i)[0] == p || book.get(i)[1] == p)
                turnFromFrontPage = i;
        }

        //hitung ganti halaman dari belakang
        int bantuHitungBlakang = 0;
        for (int i=book.size(); i>0; i--){
            if (book.get(i-1)[0] == p || book.get(i-1)[1] == p)
                turnFromBackPage = bantuHitungBlakang;
            bantuHitungBlakang += 1;
        }

        return (turnFromFrontPage < turnFromBackPage) ? turnFromFrontPage : turnFromBackPage;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nPages = input.nextInt();
        int page = input.nextInt();

        int hasil = pageCount(nPages, page);
        System.out.println(hasil);
    }
}
