
import java.util.Scanner;

public class Task12 {

    public static void task12() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите слово");
        String smileString = sc.nextLine();

        int i = 0;// переменная для цикла
        int smilesCount = 0;// кол-во смайлов

        while (i < smileString.length()) {

            // в цикле будем смотреть каждый символ
            if ((GetSymbol(smileString, i)).equals(";") || (GetSymbol(smileString, i)).equals(":")) {
                // если слово начинается ":" ";"

                i = i + 1;// наращиваем индекс

                while (GetSymbol(smileString, i).equals("-")) {
                    // проверяем наличие "-" и наращиваем индекс
                    i += 1;
                }

                int count = 0;// подсчет кол-ва совпадений {}[] в конце смайла

                boolean isEndOfSmile = CheckEndOfSmile(smileString, i);

                if(isEndOfSmile != true) {

                    // наращиваем счетчик, переходим к поиску следуюўего смайла
                    i = i+1;

                } else {

                    count += 1;// одино совпадение  уже есть

                    i = i + 1;// наращиваем индекс
                    isEndOfSmile = CheckEndOfSmile(smileString, i);

                    while (isEndOfSmile == true) {

                        if (!GetSymbol(smileString, i).equals(GetSymbol(smileString, i - 1))  ) { // если  следующий символ не совпадает с предыдущим

                            i = i + 1;// наращиваем счетчик, переходим к поиску следуюўего смайла
                            break;

                        } else {

                            i = i + 1;

                            if(i > smileString.length()-1)// проверка счетчика
                                break;

                            count += 1;// наращиваем счетчик

                            isEndOfSmile = CheckEndOfSmile(smileString, i);// находим следующий символ в ТЕУКУЩЕМ смайле для проверки в цикле while (isEndOfSmile == true)

                        }

                    }

                    if (count > 0) {

                        smilesCount += 1;// наращиваем количество смайлов

                    }

                }


            } else i += 1;// если слово начинается  с других символов , а не ":" ";" то наращиваем счетчик

        }

        System.out.println("Кол-во смайлов = " + smilesCount);
    }

    static String GetSymbol(String slowo, int index) {
// получить индекс из slowo по index
        String symbol = slowo.substring(index, index + 1);

        return symbol;
    }

    static boolean CheckEndOfSmile(String str, int index){
// является ли вырезанный символ ()[]
        boolean result =
                (GetSymbol(str, index).equals("(") ||
                        GetSymbol(str, index).equals(")") ||
                        GetSymbol(str, index).equals("[") ||
                        GetSymbol(str, index).equals("]"));

        return result;
    }

}
