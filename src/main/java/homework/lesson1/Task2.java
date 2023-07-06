package homework.lesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>() {{
            add("One");
            add("Two");
            add("Three");
            add("Four");
            add("Five");
            add("Six");
            add("Seven");
            add("Eight");
            add("Nine");
            add("Ten");
        }};
        Iterator<String> stringIterator = strings.iterator();

       while (stringIterator.hasNext()) {
           System.out.println(stringIterator.next());
       }
    }

}