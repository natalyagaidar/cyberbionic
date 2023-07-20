package homework.lesson6.task3;

public class Cow extends Animal{

    private boolean hasHorns;

    public Cow(String color, int numberOfLegs, boolean hasHorns) {
        super(color, numberOfLegs);
        this.hasHorns = hasHorns;
    }

    @Override
    public String toString() {
        return String.format("Cow:\nColor: %s\nNumber of legs: %s\nHas hons: %s", color, numberOfLegs, hasHorns);
    }
}
