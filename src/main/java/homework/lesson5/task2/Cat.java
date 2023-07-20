package homework.lesson5.task2;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException {
        Class animalClass = Animal.class;
        Animal animal = new Animal();

        try {
            Field animalKind = animalClass.getDeclaredField("kind");
            Field animalColor = animalClass.getDeclaredField("color");
            Field animalNumberOfLegs = animalClass.getDeclaredField("numberOfLegs");

            animalKind.set(animal, "Wolf");

            animalColor.setAccessible(true);
            animalColor.set(animal, "Brown");

            animalNumberOfLegs.setAccessible(true);
            animalNumberOfLegs.setInt(animal, 5);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Cant access some fields. " + e);
        }
        System.out.println(animal);
    }
}
