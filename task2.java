package seminar2;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            lst1.add(rnd.nextInt(100));
            lst2.add(rnd.nextInt(100));
        }
        System.out.println(lst1);
        System.out.println(lst2);
        System.out.println("-".repeat(16));
        lst2.removeIf(n -> n % 2 != 0);
        lst1.addAll(lst2);
        System.out.println(lst1);

    }
}
