package seminar2;

import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> intLst = new ArrayList<>();
        ArrayList<String> strLst = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            intLst.add(rnd.nextInt(-1000, 1000));
            strLst.add(String.valueOf(intLst.get(intLst.size() - 1)));
        }
        System.out.println(strLst);
        strLst.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println(strLst);

        ArrayList<String> strLst2 = new ArrayList<>();
        for (String i : strLst) {
            strLst2.add(0, i);
        }
        System.out.println(strLst2);

    }
}
