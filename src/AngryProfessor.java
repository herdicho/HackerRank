import java.util.Scanner;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {

        //hitung berapa student yang on time
        int totalOnTimeStudent = 0;
        for (int i=0; i<a.length; i++){
            if (a[i] <= 0)
                totalOnTimeStudent +=1;
        }

        //bandingkan student on time dan syarat kehadiran student
        String hasil = "";
        if (k > totalOnTimeStudent)
            hasil = "YES";
        else
            hasil = "NO";

        return hasil;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nTestCase;
        nTestCase = input.nextInt();

        for (int i=0; i<nTestCase; i++){
            int nStudent, batasMinStudent;
            nStudent = input.nextInt();
            batasMinStudent = input.nextInt();

            int[] timeStudent = new int[nStudent];
            for (int j=0; j<nStudent; j++)
                timeStudent[j] = input.nextInt();

            String hasil = angryProfessor(batasMinStudent, timeStudent);
            System.out.println(hasil);
        }

    }

}
