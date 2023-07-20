package homework.lesson5.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hi, lets learn the information about the classes I have. Pick the class to get info.");
        System.out.println("1 - Car; 2 - Animal");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Class cl = Task2.class;
        try {
            String input = reader.readLine();

            switch (input) {
                case "1":
                case "Car":
                case "car":
                    cl = Car.class;
                    break;
                case "2":
                case "Animal":
                case "animal":
                    cl = Animal.class;
                    break;
                default:
                    System.out.println("No such class :(. I will write you about the current class.");
                    break;
            }

        } catch (IOException e) {
        }

        getClassInfo(cl);
    }

    private static void getClassInfo(Class cl) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        String s3 = (char) 27 + "[31m";
        String s4 = (char) 27 + "[32m";


        System.out.println(s + "Class name: " + cl.getName());

        System.out.println(s + "Public Reflection fields:" + s1);

        Field[] fields = cl.getFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
            System.out.println();
        }

        System.out.println(s + "All Declared Fields fields:");
        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
            System.out.println();
        }

        System.out.println(s3 + "Implemented Interfaces:");
        Class[] interfaces = cl.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(s4 + "\tName: " + s1 + i.getName());
            System.out.println(s4 + "\tPackage: " + s1 + i.getPackageName());
            System.out.println();
        }

        System.out.println(s3 + "Extended Classes:");
        Class superClass = cl.getSuperclass();
        System.out.println(s4 + "\tName: " + s1 + superClass.getCanonicalName());
        System.out.println(s4 + "\tPackage: " + s1 + superClass.getPackageName());
        System.out.println();

        System.out.println(s3 + "Constructors:");
        Constructor[] ctors = cl.getConstructors();
        for (Constructor c : ctors) {
            System.out.println(s4 + "\tName: " + s1 + c.getName());
            String paramsString = s1;
            Parameter[] params = c.getParameters();
            for (Parameter p : params) {
                paramsString += paramsString + p.getType() + " " + p.getName() + " ";
            }
            System.out.println(s4 + "\tParameters: " + paramsString);
            System.out.println();
        }

        System.out.println(s3 + "Methods:");
        Method[] methods = cl.getMethods();
        for (Method m : methods) {
            System.out.println(s4 + "\tName: " + s1 + m.getName());

            String paramsString = s1;
            Parameter[] params = m.getParameters();
            for (Parameter p : params) {
                paramsString += paramsString + p.getType() + " " + p.getName() + " ";
            }
            System.out.println(s4 + "\tParameters: " + paramsString);
            System.out.println(s4 + "\tReturn type: " + s1 + m.getReturnType());
            System.out.println();
        }
    }

    class Car implements Runnable {
        public int prise;
        public String color;
        private int year;
        private String model;

        public Car(int prise, String color, int year, String model) {
            this.prise = prise;
            this.color = color;
            this.year = year;
            this.model = model;
        }

        public int getPrise() {
            return prise;
        }

        public String getColor() {
            return color;
        }

        public int getYear() {
            return year;
        }

        public String getModel() {
            return model;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setModel(String model) {
            this.model = model;
        }

        private void runTheCar() {
            System.out.printf("Wow! %s car %s is running!%n", color, model);

        }

        @Override
        public void run() {

        }
    }

    class Animal extends Car {
        public String kind;
        private String name;
        protected int numberOfLegs;

        public Animal(int prise, String color, int year, String model) {
            super(prise, color, year, model);
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumberOfLegs(int numberOfLegs) {
            this.numberOfLegs = numberOfLegs;
        }

        @Override
        public String toString() {
            return String.format("I'm a %s, my name is %s, I have %s legs", kind, name, numberOfLegs);
        }
    }
}

