package homework.lesson6.task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Nataliia D.
 * num1, num2 - numbers taken for calculation*
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CalcAnnotation {
    int num1() default 0;
    int num2() default 0;
}
