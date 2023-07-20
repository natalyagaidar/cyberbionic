package homework.lesson6.task3;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class parentClass = Animal.class;
        Class childClass = Cat.class;

        System.out.println("Annotations of the Parent class");

        for (Annotation a : parentClass.getAnnotations()) {
            System.out.println(a.annotationType());
        }

        System.out.println("Annotations of the Child class");

        for (Annotation a : childClass.getAnnotations()) {
            System.out.println(a.annotationType());
        }
    }
}
