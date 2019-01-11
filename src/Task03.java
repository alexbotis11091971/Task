import java.util.Scanner;

public class Task03 {
    public static void task03() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите предложение");
        String sample = sc.nextLine();

        int count = 1;// cчетчик количества слов равен 1 тк в цикле последнее слово не учитываеися
        while (sample.contains(" ")) {

            int index = sample.indexOf(" ");
            sample = sample.substring(0, index) + sample.substring(index + 1, sample.length());
            count = count + 1;

        }
        int sampleLength1 = sample.length();
        int countword = ( sampleLength1) / (count );
        System.out.println("средняя длина слова " + countword);

    }
}
