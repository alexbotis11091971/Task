import java.util.Scanner;

public class Task10 {

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String sample = sc.nextLine();

        int LEN = sample.length();
        int len = sample.length() - 1;


            for (int i = LEN-1 ; i >= 0; i--) {// передаем в метод символы начиная с предпоследнего
            VERH(sample,LEN, i);// формируется слово для рисования начиная с первого символа
        }
        for (int i = 0; i <= LEN-1; i++) {// передаем в метод символы начиная с первого
           NIZ(sample,LEN, i);
       }
    }


    static void VERH(String slowo,int len,int j) {// рисуем верх

        slowo = slowo.substring(0, len - j);// по введенному индексу   делаем вырезку j+1 символов  с конца слова
        for (int i=0; i<=j; i++){
        slowo = " " + slowo;// вперед добавляем j+1  пробел
        }
        System.out.println(slowo);

    }


    static void NIZ(String slowo,int len, int j) {// рисуем низ

        slowo = slowo.substring(j+1, len);// отбрасываем из слова j первых элементов
        slowo = " "+slowo ;
        System.out.println(slowo);

    }
}