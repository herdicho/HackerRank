import java.io.*;
import java.util.*;


public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> Hasil = new ArrayList<Integer>();
        Hasil.add(0);
        Hasil.add(0);

        for (int indeks=0; indeks<a.size(); indeks++) {
            if (a.get(indeks) < b.get(indeks)) {
                Hasil.set(1, (Hasil.get(1) + 1));
            }
            if (a.get(indeks) > b.get(indeks)) {
                Hasil.set(0, (Hasil.get(0) + 1));
            }
        }

        for (int i=0; i<Hasil.size(); i++)
            System.out.println(Hasil.get(i) + "\t");

        return Hasil;
    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> A = new ArrayList<Integer>();
        int a1, a2, a3;
        a1 = input.nextInt();
        a2 = input.nextInt();
        a3 = input.nextInt();
        A.add(a1);
        A.add(a2);
        A.add(a3);

        ArrayList<Integer> B = new ArrayList<Integer>();
        int b1, b2, b3;
        b1 = input.nextInt();
        b2 = input.nextInt();
        b3 = input.nextInt();
        B.add(b1);
        B.add(b2);
        B.add(b3);

        List<Integer> Hasil = new ArrayList<Integer>();
        Hasil = compareTriplets(A, B);

        System.out.println(Hasil);
    }
}
