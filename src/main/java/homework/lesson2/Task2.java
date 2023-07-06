package homework.lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> inputList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the value [" + i + "]");
            String s = reader.readLine();
            inputList.add(s);
        }
        List<String> resultList = doubleValues(inputList);

        for (String str : resultList) {
            System.out.println(str);
        }
    }

    public static List<String> doubleValues(List<String> singleValuesList) {
        ArrayList<String> resultList = new ArrayList<>();

        for(String r : singleValuesList) {
            StringBuilder sb = new StringBuilder();
            char[] chars = r.toCharArray();
            for(int i = 0; i < chars.length; i++) {
                for (int j = 0; j < 2; j++) {
                    sb.append(chars[i]);
                }
            }
            resultList.add(sb.toString());
        }

        return resultList;
    }
}
