package homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> families = fillInFamiliesData();

        checkSurnames(families);
    }

    private static HashMap<String,String> fillInFamiliesData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> families = new HashMap<>();
        String inputCity = "";
        String inputSurname = "";

        System.out.println("Input City, press Enter, then input Surname. To finish input enter 'end':");

        do {
            inputCity = reader.readLine();
            inputSurname = reader.readLine();

            if(inputCity.equalsIgnoreCase("end") || inputSurname.equalsIgnoreCase("end")) break;
            families.put(inputCity, inputSurname);
        } while (true);

        return families;
    }

    private static void checkSurnames(HashMap<String , String > families) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Family in which town are you looking for? To finish type 'end':");

        String city;
        do {
            city = reader.readLine();
            if(city.equalsIgnoreCase("end")) break;
            System.out.println(families.get(city));
        } while (true);
    }
}
