import java.util.Scanner;

public class IntroToTutorialChallenge {

    static int introTutorial(int V, int[] arr) {

        int hasil = 0;
        for (int i=0; i<arr.length; i++){
            if (V == arr[i])
                hasil = i;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cari = input.nextInt();
        int nArr = input.nextInt();
        int[] arr = new int[nArr];
        for (int i=0; i<nArr; i++)
            arr[i] = input.nextInt();

        int hasil = introTutorial(cari, arr);
        System.out.println(hasil);

    }
}
