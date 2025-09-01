package dyaz.io.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

  //* Format standard LocalTime -> HH:mm:ss.nano
  // Membuat Localtime
  @Test
  void create() {
    LocalTime localTime1 = LocalTime.now();
    LocalTime localTime2 = LocalTime.of(10, 10, 10);
    LocalTime localTime3 = LocalTime.parse("08:08");

    System.out.println(localTime1);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  // mengubah Localtime
  @Test
  void change() {
    LocalTime localTime1 = LocalTime.now();
    LocalTime localTime2 = localTime1.withHour(10);
    LocalTime localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);

    System.out.println(localTime1);
    System.out.println(localTime2);
    System.out.println(localTime3);
  }

  // Manipulasi LocalTime
  @Test
  void modify() {
    LocalTime localTime1 = LocalTime.now();
    LocalTime localTime2 = localTime1.plusHours(10);
    LocalTime localTime3 = localTime1.plusHours(5).minusMinutes(10).minusSeconds(5);

    System.out.println(localTime1);
    System.out.println(localTime2);
    System.out.println(localTime3);

  }

  // Mengambil waktu LocalTime
  @Test
  void get() {
    LocalTime localTime = LocalTime.now();

    System.out.println(localTime.getHour());
    System.out.println(localTime.getMinute());
    System.out.println(localTime.getSecond());
    System.out.println(localTime.getNano());
  }
}
