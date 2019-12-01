import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        //cari unique sock
        List<List<Integer>> uniqueSock = new ArrayList<List<Integer>>();
        for (int i=0; i<ar.length; i++){
            int kembar = 0;
            for (int j=0; j<uniqueSock.size(); j++){
                if (ar[i] == uniqueSock.get(j).get(0))
                    kembar += 1;
            }
            if (kembar == 0) {
                ArrayList<Integer> sock = new ArrayList<Integer>(2);
                sock.add(ar[i]);
                sock.add(0);
                uniqueSock.add(sock);
            }
        }

        //kelompokkan dan hitung sock per tipe sesuai yang diinputkan
        for (int i=0; i<ar.length; i++){
            for (int j=0; j<uniqueSock.size(); j++){
                if (ar[i] == uniqueSock.get(j).get(0)){
                    int skarang = uniqueSock.get(j).get(1) + 1;
                    uniqueSock.get(j).set(1, skarang);
                }
            }
        }

        //hitung berapa pasang kaos kaki yang bisa dijual
        int sockTotal = 0;
        for (int i=0; i<uniqueSock.size(); i++){
            if (uniqueSock.get(i).get(1) % 2 == 0)
               sockTotal += uniqueSock.get(i).get(1) / 2;
            else
                sockTotal += (uniqueSock.get(i).get(1)-1) / 2;
        }

        return sockTotal;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nSock;
        nSock = input.nextInt();

        int[] socks = new int[nSock];
        for (int i=0; i<nSock; i++)
            socks[i] = input.nextInt();

        int hasil = sockMerchant(nSock, socks);
        System.out.println(hasil);

    }
}
