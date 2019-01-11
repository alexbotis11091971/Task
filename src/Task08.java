import java.util.Scanner;

public class Task08 {


    public static void task08() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String sample = sc.nextLine();

        if (sample.contains("_")){
            // усли переменная содержит "_" взята из языка С++
            System.out.println("Переменная взята из языка С++");
            sample=CtoJava (sample);
        }
            else
                {
                System.out.println("Переменная взята из  языка Java");
                sample=JavaToC (sample);
            }
        System.out.println(sample);
        }




    static String  JavaToC (String name){
     int l=name.length();
     char [] SYMBOL= new char [l];
     String temp= "_";

     SYMBOL=name.toCharArray();
     int s=SYMBOL.length;
        for (int i=0; i<s;i++){

         if (Character.isUpperCase(SYMBOL[i])){// находим символ с заглавной

             SYMBOL[i]= Character.toLowerCase(SYMBOL[i]);// переводим его в нижний гегистр


             name = name.substring(0, i) +temp+SYMBOL[i]+ name.substring( i + 1, name.length());// вставляем подчеркивание перед этим символом

         }


         }
        name=name.toLowerCase();
        return name;
     }


     static String CtoJava (String name){

        int l=name.length();
        char [] SYMBOL= new char [l];
        String temp= "";

        SYMBOL=name.toCharArray();// переводим переменную в символьный массив
        int s=SYMBOL.length;
        for (int i=0; i<s;i++){

            if (SYMBOL[i]=='_'){ // находим подчеркивание
                SYMBOL[i+1]= Character.toUpperCase(SYMBOL[i+1]);// заменяем следующий символ на заглавный
                name = name.substring(0, i) +SYMBOL[i+1]+ name.substring( i + 2, name.length());// подчеркивание вырезаем

            }


        }
         return name;
        }
    }







