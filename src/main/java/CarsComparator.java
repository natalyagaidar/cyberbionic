import java.util.Arrays;
import java.util.Comparator;

public class CarsComparator {
    public static void main(String[] args) {
        Car3 car1 = new Car3(10000, "BMW", 230, "Red");
        Car3 car2 = new Car3(2000, "Audi", 230, "Grey");
        Car3 car3 = new Car3(3000, "Tesla", 300, "White");

        Car3 cars[] = {car1, car2, car3};

        Arrays.sort(cars, new Comparator<Car3>() {
            @Override
            public int compare(Car3 o1, Car3 o2) {
                return o1.price - o2.price;
            }
        });

        for (Car3 car: cars) {
            System.out.println(car.toString());
        }

        Arrays.sort(cars, new Comparator<Car3>() {
            @Override
            public int compare(Car3 o1, Car3 o2) {
                return o1.speed - o2.speed;
            }
        });

        for (Car3 car: cars) {
            System.out.println(car.toString());
        }

        Arrays.sort(cars, new Comparator<Car3>() {
            @Override
            public int compare(Car3 o1, Car3 o2) {
                return o1.color.compareTo(o2.color);
            }
        });

        for (Car3 car: cars) {
            System.out.println(car.toString());
        }
    }
}
