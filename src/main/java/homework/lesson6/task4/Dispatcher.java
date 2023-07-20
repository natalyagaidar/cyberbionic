package homework.lesson6.task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Nataliia D.
 * usage of Math annotation* *
 */
public class Dispatcher {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MathHandler mathHandler = new MathHandler();
        Class cl = MathHandler.class;

        Method m = cl.getDeclaredMethod("mathSum", int.class, int.class);
        Math mathAnno = m.getAnnotation(Math.class);
        m.invoke(mathHandler, mathAnno.num1(), mathAnno.num2());
    }
}
