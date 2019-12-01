import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {

        //pasangkan word dengan height masing2 word sesuai input
        List<Integer> listWordHeight = new ArrayList<Integer>();
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) == 'a')
                listWordHeight.add(h[0]);
            if (word.charAt(i) == 'b')
                listWordHeight.add(h[1]);
            if (word.charAt(i) == 'c')
                listWordHeight.add(h[2]);
            if (word.charAt(i) == 'd')
                listWordHeight.add(h[3]);
            if (word.charAt(i) == 'e')
                listWordHeight.add(h[4]);
            if (word.charAt(i) == 'f')
                listWordHeight.add(h[5]);
            if (word.charAt(i) == 'g')
                listWordHeight.add(h[6]);
            if (word.charAt(i) == 'h')
                listWordHeight.add(h[7]);
            if (word.charAt(i) == 'i')
                listWordHeight.add(h[8]);
            if (word.charAt(i) == 'j')
                listWordHeight.add(h[9]);
            if (word.charAt(i) == 'k')
                listWordHeight.add(h[10]);
            if (word.charAt(i) == 'l')
                listWordHeight.add(h[11]);
            if (word.charAt(i) == 'm')
                listWordHeight.add(h[12]);
            if (word.charAt(i) == 'n')
                listWordHeight.add(h[13]);
            if (word.charAt(i) == 'o')
                listWordHeight.add(h[14]);
            if (word.charAt(i) == 'p')
                listWordHeight.add(h[15]);
            if (word.charAt(i) == 'q')
                listWordHeight.add(h[16]);
            if (word.charAt(i) == 'r')
                listWordHeight.add(h[17]);
            if (word.charAt(i) == 's')
                listWordHeight.add(h[18]);
            if (word.charAt(i) == 't')
                listWordHeight.add(h[19]);
            if (word.charAt(i) == 'u')
                listWordHeight.add(h[20]);
            if (word.charAt(i) == 'v')
                listWordHeight.add(h[21]);
            if (word.charAt(i) == 'w')
                listWordHeight.add(h[22]);
            if (word.charAt(i) == 'x')
                listWordHeight.add(h[23]);
            if (word.charAt(i) == 'y')
                listWordHeight.add(h[24]);
            if (word.charAt(i) == 'z')
                listWordHeight.add(h[25]);
        }

        //cari height tertinggi
        int maxHeight = listWordHeight.get(0);
        for (int i=0; i<listWordHeight.size(); i++){
            if (listWordHeight.get(i) > maxHeight)
                maxHeight = listWordHeight.get(i);
        }

        return word.length()*1*maxHeight;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] heightWords = new int[26];
        for (int i=0; i<26; i++)
            heightWords[i] = input.nextInt();

        String word = input.next();

        int hasil = designerPdfViewer(heightWords, word);
        System.out.println(hasil);
    }

}
