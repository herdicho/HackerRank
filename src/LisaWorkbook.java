import java.util.*;

public class LisaWorkbook {

    // Complete the workbook function below.
    static int workbook(int n, int k, int[] arr) {

        //init halaman dan hasil awal
        int halaman = 1;
        int hasil = 0;

        for (int i1=0; i1<n; i1++){
            //init nilai per page di tiap chapter baru = 0
            int chapter = 0;
            for (int i2=0; i2<arr[i1]; i2++){
                // +1 hingga masing masing nilai array ke -i
                chapter += 1;

                //cek jika nilai per page = halaman maka hasil plus 1
                if (chapter == halaman)
                    hasil += 1;

                //cek untuk ganti halaman ketika nilai per page modulo k = 0 atau sudah di nilai akhir per chapter
                if (chapter % k == 0 || i2 == arr[i1]-1)
                    halaman+=1;
            }
        }
        return hasil;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nChapter = input.nextInt();
        int maxPerChapter = input.nextInt();

        int[] arrayChapter = new int[nChapter];
        for (int i=0; i<nChapter; i++)
            arrayChapter[i] = input.nextInt();

        int hasil = workbook(nChapter, maxPerChapter, arrayChapter);
        System.out.println(hasil);
    }
}
