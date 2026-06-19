package Question;

import java.time.LocalDate;

public class ValideDate {
    public static void main(String[] args) {
        String d="2026-06-19";
      try {
          System.out.println(LocalDate.parse(d));
          System.out.println("ValideDate");
      }
      catch (Exception e) {
          System.out.println("Invalid date");
      }

    }
}