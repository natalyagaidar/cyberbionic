package homework.lesson1;


public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int speeds = this.speed - ((Car)o).speed;
        if (speeds == 0) {
            int prices = this.price - ((Car)o).price;
            if(prices == 0) {
                int models = this.model.compareTo(((Car)o).model);
                if(models == 0) {
                    return this.color.compareTo(((Car)o).color);
                }
                else return models;
            } else return prices;
        } else {
            return speeds;
        }
    }
}

