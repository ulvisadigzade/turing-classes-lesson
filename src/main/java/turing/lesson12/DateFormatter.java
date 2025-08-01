package turing.lesson12;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime localZoned = now.atZone(ZoneId.systemDefault());
        ZonedDateTime turkeyTime = localZoned.withZoneSameInstant(ZoneId.of("Europe/Istanbul"));


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd, HH/mm/ss");
        String formattedDate = turkeyTime.format(formatter);

        System.out.println(formattedDate);
    }
}
