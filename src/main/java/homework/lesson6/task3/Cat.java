package homework.lesson6.task3;

public class Cat extends Animal{

    private String breed;

    public Cat(String color, int numberOfLegs, String breed) {
        super(color, numberOfLegs);
        this.breed = breed;
    }
}
