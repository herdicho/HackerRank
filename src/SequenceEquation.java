import java.util.Scanner;

public class SequenceEquation {

    static int[] permutationEquation(int[] p) {

        int[] hasil = new int[p.length];

        for (int i=0; i<p.length; i++){
            int iter1 = cariPosisi(p, (i+1));
            int iter2 = cariPosisi(p, (iter1 + 1));
            hasil[i] = iter2+1;
        }

        return hasil;
    }

    static int cariPosisi(int[] p, int number){
        int posisi = 0;

        for (int i=0; i<p.length; i++){
            if (p[i] == number)
                posisi = i;
        }

        return posisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nNumber = input.nextInt();
        int[] number = new int[nNumber];
        for (int i=0; i<nNumber; i++)
            number[i] = input.nextInt();

        int hasil[] = permutationEquation(number);
        for (int i=0; i<hasil.length; i++)
            System.out.println(hasil[i]);

    }
}
