import java.util.Scanner;

public class Task01 {
    public static void task01() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String sample = sc.nextLine();
        System.out.println("введите символ");
        String symb = sc.next();
        String temp = "";
        int count = 0;
        while (sample.contains(symb)) {

            int index = sample.indexOf(symb);
            System.out.println("совпадает индекс    "+index);
            sample = sample.substring(0, index) + sample.substring( index + 1, sample.length());
            count = count + 1;
        }

        if (count != 0)
            System.out.println("количество совпадений равно    " + count);
        else
            System.out.println(" совпадений нет");


    }
}
