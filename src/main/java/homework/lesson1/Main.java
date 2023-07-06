package homework.lesson1;

import java.util.Arrays;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car c4 = new Car(185, 10000, "BMW", "White");
        Car c5 = new Car(185, 10000, "BMW", "White");
        Car[] c = new Car[]{c1, c2, c3, c4, c5};
        Arrays.sort(c);
        Car[] var5 = c;
        int var6 = c.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Car temp = var5[var7];
            System.out.println(temp);
        }
    }
}
