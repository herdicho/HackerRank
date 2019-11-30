import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
        int pagar;
        pagar = n-1;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j < pagar)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            pagar -=1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        staircase(n);
    }

}
