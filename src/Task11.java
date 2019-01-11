import java.util.Scanner;

public class Task11 {


    public static void task11() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите слово cсостоящее из букв a,b,c");
        String Slowo = sc.nextLine();

        int Count= Symbol(Slowo)+Twobb(Slowo)+Three (Slowo)+ ThreeDif (Slowo)+ TwoDif (Slowo);

        if (Count>0){

            System.out.println("Такого слова в языке Мумба-Юмба нет");
        }
       else
            System.out.println("Такоe слова в языке Мумба-Юмба ecть");
    }

    static int  Symbol(String slowo) {//проверка наличия других букв в слове
// получить индекс из slowo по index
        int count = 0;

        for (int i = 0; i < slowo.length(); i++) {
            char symbol = slowo.charAt(i);
            if (symbol != 'a' && symbol != 'b' && symbol != 'b') {
                count += 1;

            }

        }
        return count;
    }

    static int Twobb(String slowo) {
        //проверяем в слове наличие bb

        int count = 0;
        String temp="bb";
        for (int i = 0; i < slowo.length()-2; i++) {

            String temp1 = slowo.substring(i, i + 2);
            if (temp.equals(temp1)) {
                count += 1;

                break;
            }
        }
        return count;
    }

    static int Three(String slowo) {
        //проверяем наличие одинаковых сочетаний "aaa";"ccc"; т.к. bbb проверено в предыдущем методе
        int count = 0;
        String temp1="aaa";
        String temp2="ccc";

        for (int i = 0; i < slowo.length()-3; i++) {

            String temp3 = slowo.substring(i, i + 3);
            if (temp1.equals(temp3)|| temp2.equals(temp3)) {
                count += 1;

                break;
            }
        }
        return count;
    }



    static int ThreeDif (String slowo) {
        // проверяем наличие совпадения последовательности
        int count=0;


        for (int i=0; i<slowo.length()-8; i++){

            String temp1= slowo.substring(i,i+3);
            String temp2= slowo.substring(i+3,i+6);
            String temp3= slowo.substring(i+6,i+9);
            if (temp1.equals(temp2)&& temp1.equals(temp3) ){
                count+=1;
                break;
            }

            }



        return count;
            }

    static int TwoDif (String slowo) {
        // проверяем наличие совпадения последовательности
        int count=0;


        for (int i=0; i<slowo.length()-5; i++){

            String temp1= slowo.substring(i,i+2);
            String temp2= slowo.substring(i+2,i+4);
            String temp3= slowo.substring(i+4,i+6);
            if (temp1.equals(temp2)&& temp1.equals(temp3) ){
                count+=1;
                break;
            }

        }



        return count;
    }

        }




