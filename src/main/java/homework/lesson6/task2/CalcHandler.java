package homework.lesson6.task2;

/**
 * @author Nataliia D.
 */
public class CalcHandler {

    /**
     * Adds 2 numbers*
     * @param a
     * @param b
     */
    @CalcAnnotation(num1 = 27, num2 = 3)
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    /**
     * Substrates first second from first*
     * @param a
     * @param b
     */
    @CalcAnnotation(num1 = 44, num2 = 4)
    public void subtract(int a, int b) {
        System.out.println(a - b);
    }

    /**
     * Multiplies 2 numbers*
     * @param a
     * @param b
     */
    @CalcAnnotation(num1 = 3, num2 = 15)
    public void multiply(int a, int b) {
        System.out.println(a * b);
    }

    /**
     * Divides first number by second
     * Division by zero is forbidden*
     */
    @CalcAnnotation(num1 = 100, num2 = 3)
    public void divide(int a, int b) {
        if (b != 0)
            System.out.println((double)a / b);
        else System.out.println("Division by zero is forbidden");
    }

}
