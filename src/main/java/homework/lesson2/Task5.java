package homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> inputList = new ArrayList<>();
        System.out.println("Enter the lines. Input 'end' to finish:");

        do {
            String input  = reader.readLine();

            if(input.equalsIgnoreCase("end")) break;
            inputList.add(input);
        } while (true);

        for(String line : inputList) {
            System.out.println(line);
        }
    }
}
