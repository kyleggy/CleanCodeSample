package functions.tryyourself;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Use String.format to separate the layout of a String (how it is printed) from the data (what is being printed).
 */

public class Mission {

    LocalDate start = LocalDate.parse("2023-02-23");

    public void update(String author, String message) {
        LocalDate today = LocalDate.now();
        String month = String.valueOf(today.getMonthValue());
        String formattedMonth = month.length() < 2 ? "0" + month : month;
        String entry = author.toUpperCase() + ": [" + formattedMonth + "-" +
                today.getDayOfMonth() + "-" + today.getYear() + "](Day " +
                (ChronoUnit.DAYS.between(start, today) + 1) + ")> " +
                message + System.lineSeparator();
        System.out.println(entry);
    }
}


