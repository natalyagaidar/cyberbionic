package homework.lesson6.task2;

import java.lang.reflect.Method;

/**
 * @author Nataliia D.
 * 4 methods are used: add, substract, multiply, divide* *
 */
public class Dispatcher {
    public static void main(String[] args) {
        CalcHandler calcHandler = new CalcHandler();
        Class<?> cl = CalcHandler.class;
        try {
            Method addMethod = cl.getDeclaredMethod("add", int.class, int.class);
            CalcAnnotation calcAnnotationAdd = addMethod.getAnnotation(CalcAnnotation.class);
            calcHandler.add(calcAnnotationAdd.num1(), calcAnnotationAdd.num2());

            Method subtractMethod = cl.getDeclaredMethod("subtract", int.class, int.class);
            CalcAnnotation calcAnnotationSubstract = subtractMethod.getAnnotation(CalcAnnotation.class);
            calcHandler.subtract(calcAnnotationSubstract.num1(), calcAnnotationSubstract.num2());

            Method multiplyMethod = cl.getDeclaredMethod("multiply", int.class, int.class);
            CalcAnnotation calcAnnotationMultiply = multiplyMethod.getAnnotation(CalcAnnotation.class);
            calcHandler.multiply(calcAnnotationMultiply.num1(), calcAnnotationMultiply.num2());

            Method divideMethod = cl.getDeclaredMethod("divide", int.class, int.class);
            CalcAnnotation calcAnnotationDivide = divideMethod.getAnnotation(CalcAnnotation.class);
            calcHandler.divide(calcAnnotationDivide.num1(), calcAnnotationDivide.num2());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
