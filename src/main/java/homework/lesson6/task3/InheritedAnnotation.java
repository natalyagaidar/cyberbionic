package homework.lesson6.task3;

import java.lang.annotation.*;

/**
 * @author Nataliia D.
 * This annotation will be inherited in the child classes*
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedAnnotation {
}
