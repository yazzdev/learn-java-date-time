package dyaz.io.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {

  // Immutable same as LocalDate/LocalTime
  // Default format LocalDateTime -> yyyy-MM-ddTHH:mm:ss.nano

  // Membuat LocalDateTime
  @Test
  void create() {
    LocalDateTime localDateTime1 = LocalDateTime.now();
    LocalDateTime localDateTime2 = LocalDateTime.of(2002, Month.JANUARY, 8, 10, 9, 10,456000000);
    LocalDateTime localDateTime3 = LocalDateTime.parse("2002-01-08T10:09:10.456");

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);

  }

  // Mengubah LocalDateTime
  @Test
  void with() {
    LocalDateTime localDateTime1 = LocalDateTime.now();
    LocalDateTime localDateTime2 = localDateTime1.withYear(1980).withMonth(1);
    LocalDateTime localDateTime3 = localDateTime1.withYear(1988).withHour(9);

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }

  // Manipulasi LocalDateTime
  @Test
  void modify() {
    LocalDateTime localDateTime1 = LocalDateTime.now();
    LocalDateTime localDateTime2 = localDateTime1.plusYears(5).minusHours(15);
    LocalDateTime localDateTime3 = localDateTime1.minusYears(5).plusHours(15);

    System.out.println(localDateTime1);
    System.out.println(localDateTime2);
    System.out.println(localDateTime3);
  }

  // Mengambil data LocalDateTime
  @Test
  void get() {
    LocalDateTime localDateTime = LocalDateTime.now();

    System.out.println(localDateTime.getYear());
    System.out.println(localDateTime.getMonth());
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getHour());
    System.out.println(localDateTime.getMinute());
    System.out.println(localDateTime.getSecond());
    System.out.println(localDateTime.getNano());
  }

  // Konversi dari dan ke LocalDate
  @Test
  void date() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalDate localDate = localDateTime.toLocalDate();
    System.out.println(localDate);

    LocalDateTime result = localDate.atTime(10, 10, 10, 10);
    System.out.println(result);

  }

  // Konversi dari dan ke LocalTime
  @Test
  void time() {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalTime localTime = localDateTime.toLocalTime();
    System.out.println(localTime);

    LocalDateTime result = localTime.atDate(LocalDate.now());
    System.out.println(result);
  }
}
