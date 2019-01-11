
import java.util.Scanner;

public class Task09 {

    public static void task09() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите 1 строку");
        String sample = sc.nextLine();
        System.out.println("введите 2 строку");
        String sample1 = sc.nextLine();



        boolean isAnagram = IsAnagram(sample, sample1);

        if (isAnagram) {   // если  все слова  анограмны

            System.out.println("Строка анограма");

        }
        else{

            System.out.println("Строка не анограма");

        }

    }

    static boolean IsAnagram(String firstString, String secondString ){

        boolean result = false;

        //удаляем знаки препинания
        firstString = Replase(firstString);
        secondString = Replase(secondString);

        // делим предложение на слова и помещаем в таблицу
        String[] words = firstString.split(" ");
        String[] words1 = secondString.split(" ");

        // для каждой таблицы ставим в соответствие таблицу длины слов
        int n = words.length;
        int[] lenwords = new int[n];
        lenwords = Lenwords(words);

        int n1 = words1.length;
        int[] lenwords1 = new int[n1];
        lenwords1 = Lenwords(words1);

        // если слова одинаковой длины то проверяем их на анаграмность

        if(n != n1){

            System.out.println("Строка не анограма");
            return result;
        }

        int count = 0; // счетчик анограмных слов

        for (int i = 0; i < n; i++) {

            boolean Res = false;// анограмно ли слово

            for (int j = 0; j < n1; j++) {
                if (lenwords[i] == lenwords1[j]) {
// если слова одинаковой длины
                    Res = Egual(words[i], words1[j]);  //проверяем их на анаграмность
                }

                if (Res == true) {

                    count += 1; // счетчик увеличиваем на 1
                    break;

                }

            }

        }

        if (count == n) {   // если  все слова  анограмны

            result = true;

        }
        else{

            result = false;

        }

        return result;
    }


    static String Replase(String name) {
        //замена знаков препиная на ""
        name = name.replace(",", "");
        name = name.replace(":", "");
        name = name.replace("-", "");
        return name;
    }

    static int[] Lenwords(String[] words) {
        //coздан ие таблицы длины слов
        int n = words.length;
        int[] lenwords = new int[n];
        for (int i = 0; i < n; i++) {

            lenwords[i] = words[i].length();
        }
        return lenwords;

    }

    static Boolean Egual (String Words1, String Words2) {

        // проверка являются ли отдельные слова анограммой
        boolean result= true;

        for (int i=0; i< Words1.length(); i++){

            String temp = Words1.substring(i,i+1);

            if (!Words2.contains(temp) ){
                result = false;
                break;


            }

        }

        return result;
    }


}












