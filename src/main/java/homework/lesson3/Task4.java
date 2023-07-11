package homework.lesson3;


import java.io.*;

public class Task4 {

    public static void main(String[] args) {
        try {
            File f1 = new File(System.getProperty("user.dir") + "\\src\\main\\java\\homework\\lesson3\\task4.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));

            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
