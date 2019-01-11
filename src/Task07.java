import java.util.Scanner;

public class Task07 {


    public static void task07() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String sample = sc.nextLine();
        char res= ' ';
        String result="";

          for (char symbol :sample.toCharArray()){
            // создаем массив символов из строки

            if (Character.isDigit(symbol)){// если символ цифра
                symbol=('_');

            }
            else if (Character.isUpperCase(symbol)) {// если верхний регистр


                symbol = Character.toLowerCase(symbol);// string в нижний регистр
            }
            else {

                symbol = Character.toUpperCase(symbol);// string в верхний  регистр

            }

           result= result.concat(Character.toString(symbol));// собираем символы в строку
           // System.out.println(result);
         }
        System.out.println(result);
        }


}

