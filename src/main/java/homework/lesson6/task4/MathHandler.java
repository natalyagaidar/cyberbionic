package homework.lesson6.task4;

/**
 * @author Nataliia D.
 */
public class MathHandler {

    /**
     * Adds 2 numbers*
     * @param num1
     * @param num2
     */
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
