import java.util.Scanner;

public class Task02 {

    public static void task02()

    {
     String Stringline="" ;
     int i=1;
     while ( i<= 1000){
         String temp= Integer.toString(i);
          Stringline=Stringline+ temp;
          i+=1;
     }
       Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int n = sc.nextInt();
        String number= Integer.toString (n);

       int index=1;
       int l= Stringline.length();
        char pass[] = new char[l];
      pass= Stringline.toCharArray();
        String NumberResult= Character.toString(pass[n]);
        System.out.println(NumberResult);




        }
    }

