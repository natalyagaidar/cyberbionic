package homework.lesson3;

public class Task3 {
    public static void main(String[] args) {
        String randomString = "Should I eat the same breakfast every morning?";
        int stringLength = randomString.length();
        String firstPart = randomString.substring(0, stringLength/2);
        String secondPart = randomString.substring(stringLength/2, stringLength);
        System.out.println(randomString);
        System.out.println(firstPart);
        System.out.println(secondPart);
    }
}
