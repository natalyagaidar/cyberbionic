package homework.lesson6.task3;

import jdk.jfr.Threshold;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@InheritedAnnotation
@NotInheritedAnnotation
@Deprecated
@SuppressWarnings("this is some value")
@Threshold
public class Animal {
    protected String color;
    protected int numberOfLegs;

    public Animal(String color, int numberOfLegs) {
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }
}
