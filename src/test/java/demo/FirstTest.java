package demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FirstTest {

    @Test
    void shouldCompare() {
        String data = "11.08.2022";
        LocalDate parsedDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Assertions.assertEquals(DayOfWeek.THURSDAY,parsedDate.getDayOfWeek());
    }
}
