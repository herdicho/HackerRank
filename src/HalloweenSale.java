import java.util.Scanner;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {

        int totalHarga = 0;
        int nGames = -1;
        do {
            totalHarga += p;
            p -= d;
            if (p <= m)
                p = m;
            nGames += 1;
        } while (totalHarga <= s);

        return nGames;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price, discount, limit, money;
        price = input.nextInt();
        discount = input.nextInt();
        limit = input.nextInt();
        money = input.nextInt();

        int hasil = howManyGames(price, discount, limit, money);
        System.out.println(hasil);
    }
}
