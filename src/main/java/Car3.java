import java.util.Comparator;

public class Car3 {

    Integer price;
    String model;
    int speed;
    String color;

    public Car3(Integer price, String model, int speed, String color) {
        this.price = price;
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }


}
class ClassComparatorByPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Car3)o1).price - ((Car3)o2).price;
    }
}

class ClassComparatorBySpeed implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Car3)o1).speed - ((Car3)o2).speed;
    }
}

class ClassComparatorByColor implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Car3)o1).color.compareTo(((Car3)o2).color);
    }
}
