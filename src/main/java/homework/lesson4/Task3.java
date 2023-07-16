package homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String format = "dd/MMM/yyyy";
        System.out.println(String.format("Enter date of your birthday in format %s: ", format));
        String dateInput = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);

        Date dateOfBirth = null;
            try {
                dateOfBirth = dateFormat.parse(dateInput);
            } catch (ParseException e) {
                System.out.print("Wrong date of birth. " +  e);
            }
        if (!(dateOfBirth == null)) {
            LocalDate now = LocalDate.now();
            LocalDate localeDateOfBirth = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Period period = Period.between(localeDateOfBirth, now);
            System.out.printf("You are %s years, %s months, %s days old%n", period.getYears(), period.getMonths(), period.getDays());
        }
    }

}
