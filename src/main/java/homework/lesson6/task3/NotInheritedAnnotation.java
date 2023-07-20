package homework.lesson6.task3;

import java.lang.annotation.*;

/**
 * @author Nataliia D.
 * This annotation will NOT be inherited in the child classes*
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotInheritedAnnotation {
}
