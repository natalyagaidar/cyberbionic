package homework.lesson5.task2;

public class Animal {
    public String kind = "Cow";
    private String color = "grey";
    protected int numberOfLegs = 4;

    @Override
    public String toString() {
        return String.format("Hi, I'm a %s, I am of %s color and have %s legs.", kind, color, numberOfLegs);
    }
}
