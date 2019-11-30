import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BirthdayChocolate {


  static int birthday(List<Integer> s, int d, int m) {

    


    return 5;
  }



  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  int nChocolate, dayBirth, monthBirth, inputan;
  nChocolate = input.nextInt();

  List<Integer> chocolate = new ArrayList<Integer>(nChocolate);
  for (int i=0; i<nChocolate; i++){
    inputan = input.nextInt();
    chocolate.add(inputan);
  }

  dayBirth = input.nextInt();
  monthBirth = input.nextInt();

  int hasil = birthday(chocolate, dayBirth, monthBirth);

  }

}
