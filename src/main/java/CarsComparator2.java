import java.util.Arrays;
import java.util.Comparator;

public class CarsComparator2 {

    public static void main(String[] args) {
        Car3 car1 = new Car3(10000, "BMW", 230, "Red");
        Car3 car2 = new Car3(2000, "Audi", 230, "Grey");
        Car3 car3 = new Car3(3000, null, 300, "White");

        Car3 cars[] = {car1, car2, car3};

        Arrays.sort(cars, new ClassComparatorByPrice());

        for (Car3 car: cars) {
            System.out.println(car.toString());
        }

        Arrays.sort(cars, new ClassComparatorBySpeed());

        for (Car3 car: cars) {
            System.out.println(car.toString());
        }

        Arrays.sort(cars, new ClassComparatorByColor());

        for (Car3 car: cars) {
            System.out.println(car.toString());
        }
    }
}
