import java.util.Scanner;

public class UtopianTree {

    static int utopianTree(int n) {
        int tinggiAwal = 1;
        for (int i=1; i<=n; i++){
            if (i % 2 != 0)
                tinggiAwal *= 2;
            if (i % 2 == 0)
                tinggiAwal += 1;
        }

        return tinggiAwal;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nTree = input.nextInt();
        for (int i=0; i<nTree; i++){
            int tree = input.nextInt();
            int hasil = utopianTree(tree);
            System.out.println(hasil);
        }
    }
}
