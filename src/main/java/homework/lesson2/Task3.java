package homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        int numberOfAttempts = 5;
        do {
            System.out.println("Enter number of integers:");
            inputString = reader.readLine();
        } while(!isNumeric(inputString) && --numberOfAttempts > 0);

        if(isNumeric(inputString)) {
            int numberOfIntegers = Integer.parseInt(inputString);
            System.out.println("The minimum value in the list is: " + getMinimum(getIntegerList(numberOfIntegers)));
        } else {
            System.out.println("Game over");
            return;
        }
    }

    private static LinkedList<Integer> getIntegerList(int numberOfInts){
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = 0; i < numberOfInts; i++) {
            res.add(new Random().nextInt(100) + 1);
        }
        System.out.println("Unsorted list: \n " + res);
        return res;
    }

    private static Integer getMinimum(LinkedList<Integer> list) {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Objects.equals(o1, o2) ? 0 : o1-o2;
            }
        });
        System.out.println("Sorted list: \n" + list);
        return list.getFirst();
    }

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}
