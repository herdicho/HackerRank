import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {

        //hitung biaya total tanpa makanan yang tidak dipilih anna
        int totalPriceAnna = 0;
        for (int i=0; i<bill.size(); i++){
            if (bill.get(i) != bill.get(k))
                totalPriceAnna += bill.get(i);
        }

        //bagi 2 total bill
        totalPriceAnna /= 2;

        //sout berdasarkan kondisi
        if (b - totalPriceAnna > 0)
            System.out.println(b - totalPriceAnna);
        else
            System.out.println("Bon Appetit");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nFood, indeksAnnaDontEat, annacharged;
        nFood = input.nextInt();
        indeksAnnaDontEat = input.nextInt();

        List<Integer> bills = new ArrayList<Integer>(nFood);
        for (int i=0; i<nFood; i++){
            int bill = input.nextInt();
            bills.add(bill);
        }

        annacharged = input.nextInt();

        bonAppetit(bills, indeksAnnaDontEat, annacharged);

    }

}
