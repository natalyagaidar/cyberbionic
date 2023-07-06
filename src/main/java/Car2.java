class Car2 implements Comparable<Car2> {
    Integer price;
    String model;
    int speed;
    String color;

    public Car2(Integer price, String model, int speed, String color) {
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


    @Override
    public int compareTo(Car2 o) {
        int temp = this.speed - o.speed;
        if (temp == 0) {
            return this.price - o.price;
        } else {
            return temp;
        }
    }
}
