package academy.marcoscaretaker.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20260730", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2026-07-30+07:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2026-07-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse = LocalDateTime.parse("2026-07-30T17:56:03.5211179", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse);
        //dd/MM/yyyy - Brazil
        //MM/dd/yyyy - EUA
        //yyyy/MM/dd - Japan
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatStringBR = LocalDate.now().format(formatterBR);
        System.out.println(formatStringBR);

        LocalDate parseBR = LocalDate.parse("30/07/2026", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter dateTimeFormatterGerman = DateTimeFormatter.ofPattern("dd.MMMMM.yyyy", Locale.GERMAN);
        String formatGerman = LocalDate.now().format(dateTimeFormatterGerman);
        System.out.println(formatGerman);

        LocalDate parseGerman = LocalDate.parse("30.J.2026", dateTimeFormatterGerman);
        System.out.println(parseGerman);
    }
}
