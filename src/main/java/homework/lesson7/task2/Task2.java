package homework.lesson7.task2;

import homework.lesson6.task3.Animal;
import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        Animal animal = new Animal("white", 4);

        String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\homework\\lesson7\\task2\\task2.txt";

        File file = new File(filePath);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(animal);
            } catch (IOException e) {
                System.out.println("Can't serialize object " + animal.getClass() + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't open the file " + file.getPath());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Animal readAnimal = (Animal) ois.readObject();
            System.out.println(readAnimal);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Can't deserialize the object." + e.getMessage());
        }
    }
}
