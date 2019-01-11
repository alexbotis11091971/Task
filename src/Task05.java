import java.util.Scanner;

public class Task05 {

    public static void task05() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String sample = sc.nextLine();

        int count = 0;// счетчик четных слов
        sample = sample.replace(":", " ");// меняем двоеточие на пробел

        while (sample.contains(" ")) {

            int index = sample.indexOf(" ");
            String sample1 = sample.substring(0, index);// вырезаем слово
            sample = sample.substring(index + 1, sample.length());// вырезаем слово из строки

            if (sample1.length() % 2 == 0) { // проверяем на четность слово
                count = count + 1;
            }
        }
        if (sample.length() % 2 == 0)// проверяем на четность последнее слово не вошедшее в цикл
            count = count + 1;
        if (count != 0)
            System.out.println("количество  четных слов  равно    " + count);
        else
            System.out.println(" четных слов  нет");


    }
}
