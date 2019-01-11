

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("введите номер задания");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    Task01.task01();
                    break;
                case 2:
                    Task02.task02();
                    break;
                case 3:
                    Task03.task03();
                    break;
                case 4:
                    Task04.task04();
                    break;
                case 5:
                    Task05.task05();
                    break;
                case 6:
                    Task06.task06();
                    break;
                case 7:
                   Task07.task07();
                    break;
                case 8:
                    Task08.task08();
                    break;
                case 9:
                    Task09.task09();// в коде ошибка не найдена
                    break;
                case 10:
                    Task10.task10();
                    break;
                case 11:
                    Task11.task11();
                    break;
                case 12:
                   Task12.task12();// в коде ошибка не найдена
                    break;


            }
        }
    }
}


