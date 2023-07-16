package homework.lesson4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        File f1 = new File(System.getProperty("user.dir") + "\\src\\main\\java\\homework\\lesson4\\task2.txt");
        String prepositions = "\\swith\\s|\\sfor\\s|\\swithout\\s|\\suntil\\s|\\sfrom\\s|\\sunder\\s|\\sin\\s|\\satop\\s|\\sto\\s";
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String fileLine = null;
            while ((fileLine = br.readLine()) != null) {
                String tmp = fileLine.replaceAll(prepositions, " Java ");
                lines.add(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1)))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
