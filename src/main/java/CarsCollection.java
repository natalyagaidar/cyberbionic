import java.util.ArrayList;
import java.util.Arrays;

public class CarsCollection {

    public static void main(String[] args) {

        Car2 car1 = new Car2(10000, "BMW", 230, "Red");
        Car2 car2 = new Car2(2000, "Audi", 230, "Grey");
        Car2 car3 = new Car2(3000, "Tesla", 300, "White");

        Car2 cars[] = {car1, car2, car3};

        Arrays.sort(cars);

        for (Car2 car: cars) {
            System.out.println(car.toString());
        }
    }
}


