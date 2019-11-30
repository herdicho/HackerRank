import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int sisaMod;

        for (int i=0; i<grades.size(); i++){
            if (grades.get(i) % 5 != 0) {
                sisaMod = grades.get(i) % 5;
                if (5-sisaMod <3 && grades.get(i) > 37)
                    grades.set(i, grades.get(i) + (5-sisaMod));
            }
        }

        return grades;

    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int nSiswa;

        nSiswa = input.nextInt();
        List<Integer> nilaiSiswa = new ArrayList<Integer>(nSiswa);

        for (int i=0; i<nSiswa; i++){
            int nilai;
            nilai = input.nextInt();
            nilaiSiswa.add(nilai);
        }


        List<Integer> hasil = new ArrayList<Integer>(nSiswa);
        hasil = gradingStudents(nilaiSiswa);

        for (int i=0; i<hasil.size(); i++){
            System.out.println(hasil.get(i));
        }
    }
}
