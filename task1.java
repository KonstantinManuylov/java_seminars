//package seminar2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class task1 {
//    public static void main(String[] args) {
//
////        Object o = new Object();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        List<String> list3 = new ArrayList<>();
//
////        list.add(1);
////        list.add(0, 1);
////        list.add(2.f);
////        list.add(new int[]{5,3,8});
////        list.add(true);
////        String s = list.get(2);
////
////        int i = 0;
////        if (list.get(0) instanceof Integer) {
////            i = (int)list.get(0);
////        }
//
//        for (int i = 0; i < 16; i++) {
//            list.add(new Random().nextInt(10));
//            list2.add(new Random().nextInt(10));
//            list3.add(Character.getName(i));
//        }
//        //1234
//        //5678
//        //12567834
////        list.addAll(list.size()/2, list2);
//
//        //12567834
//        //2567834
////        list.remove(0);
////        Integer i = 0;
////        list.remove(i);
//
////        list.clear();
////        list.set(0, 7);
////        System.out.println(list);
////        System.out.println(list2);
////        System.out.println(list3);
////        System.out.println("-".repeat(16));
//
////        list3.sort(new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                return o1.length() - o2.length();
////            }
////        });
//
////        list.removeIf(n -> n%2!=0);
////        list.removeAll(list2);
////        list.retainAll(list2);
////        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (int i: list) {
//            System.out.println(i);
//        }
//
//        ListIterator<Integer> iterator = list.listIterator(list.size()/2);
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            iterator.remove();
//            iterator.set(5);
//            iterator.add(45);
//            int index = iterator.previousIndex();
//            System.out.println(i);
//        }
//
//        list.forEach(n -> list2.add(n));
//
//    }