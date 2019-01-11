

public class Task06 {

    public static void task06() {
        int count=0;
        for (int i = 4; i < 99995; i++) {

            String temp = Integer.toString(i);

            if (temp.contains("4") || temp.contains("13") || temp.contains("413") || temp.contains("134")) {
                count +=1;
            }
        }

        System.out.println(count);
    }
}
