import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        arrayLists();
    }

    private static void arraysMethod() {
        int [] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr.length);
        arr = new int[10];
        System.out.println(arr);
        System.out.println(arr.length);

    }

    private static void arraysMethod2() {
        int[] x = {2, 4,6,78, 9};
        for(int i = 0; i< x.length; i++ ) {
            System.out.println(x[i] + " ");
        }
        System.out.println();
    }

    private static void cars() {
        Car car1 = new Car("BMW" , 33000);
        Car car2 = new Car("Audi", 20000);
        Car car3 = new Car("Opel", 11000);

        Car[] cars = {car1, car2, car3};

        for (Car c: cars) {
            c.setPrice(c.getPrice() + 500);
            c = new Car("Lanos", 5000);
            System.out.println(c.toString());
        }

        for (Car c : cars) {
            System.out.println(c.toString());
        }
    }

    private static void arrayLists() {
        ArrayList<Integer> i = new ArrayList<>();

        i.add(23);
        i.add(22);
        i.add(33);
        System.out.println(i);

        Iterator<Integer> it = i.iterator();

        while (it.hasNext()) {
            Integer integer = it.next();

            System.out.println(integer);
        }

        ListIterator<Integer> listIterator = i.listIterator();

        while (listIterator.hasNext()) {
           listIterator.next();
        }

        while (listIterator.hasPrevious()) {
            Integer prev = listIterator.previous();
            System.out.println(prev);
        }
    }
}
