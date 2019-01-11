import java.util.Scanner;

public class Task04 {


    public static void task04() {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите строку");
        String sample = sc.nextLine();


        while (sample.contains(" ")) {
            int index = sample.indexOf(" ");

            String sample1 = sample.substring(0, index);
            boolean gl = Glasnyje(sample1);
            boolean sogl = Soglasnyje(sample1);
            if (gl & sogl) {
                System.out.println(sample1);
            }
            sample = sample.substring(index + 1, sample.length());

        }

        boolean gl = Glasnyje(sample);
        boolean sogl = Soglasnyje(sample);
        if (gl & sogl) {
            System.out.println(sample);

        }
    }

            static boolean Glasnyje (String slowo){
                String Gb = "aeiouy";

                boolean d = false;
                String b1 = slowo.substring(0, 1);
                if (Gb.contains(b1)) {
                    d = true;

                }
                return d;
            }


                static boolean Soglasnyje (String slowo){

                     String Sgb="bcdfghjklmnqrstvwxz";
                    boolean d=false;
                    String b1= slowo.substring(slowo.length()-1,slowo.length());
                    if (Sgb.contains(b1)){
                        d= true;

                    }
                    return d;


                }

            }



