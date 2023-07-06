import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collections {

    public static void main(String[] args) {
        arrayLists();
    }


    private static void arrayLists() {
        ArrayList<Integer> i = new ArrayList<>();

        i.add(11);
        i.add(22);
        i.add(33);
        System.out.println(i);

        Iterator<Integer> it = i.iterator();

        while (it.hasNext()) {
            Integer integer = it.next();

            System.out.println(integer);
        }

        ListIterator<Integer> listIterator = i.listIterator(i.size());
        while (listIterator.hasPrevious()) {
            Integer prev = listIterator.previous();
            System.out.println(prev);
        }


       /* while (listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious()) {
            Integer prev = listIterator.previous();
            System.out.println(prev);
        }*/
    }

}
