package homework.lesson3;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try {
            String currentPath = System.getProperty("user.dir");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(currentPath + "/lesson3task2.txt")));
            bw.write("Hello World!");
            bw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(currentPath + "/lesson3task2.txt")));
            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();
            System.out.println("The job's finished.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
