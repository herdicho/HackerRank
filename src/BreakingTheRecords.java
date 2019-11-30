import java.util.Scanner;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {
        //set nilai awal untuk patokan nilai max dan min
        int max, min;
        max = scores[0];
        min = scores[0];

        //set nilai awal untuk break record max dan min
        int[] breakRecord = new int[2];
        breakRecord[0] = 0;
        breakRecord[1] = 0;

        //hitung berapa kali nilai maks dan min di break
        for (int i=0; i<scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
                breakRecord[0] += 1;
            }
            if (scores[i] < min){
                min = scores[i];
                breakRecord[1] += 1;
            }
        }

        return breakRecord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nRecord;
        nRecord = input.nextInt();

        int[] record = new int[nRecord];
        for (int i=0; i<nRecord; i++)
            record[i] = input.nextInt();

        int[] hasil = new int[2];
        hasil = breakingRecords(record);

        for (int i=0; i<hasil.length; i++)
            System.out.print(hasil[i] + " ");
    }
}
