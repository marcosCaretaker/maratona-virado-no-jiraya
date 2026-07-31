package academy.marcoscaretaker.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(5);
        Period twoYearInterval = Period.between(now, nowAfterTwoYears);
        Period sevenDaysPeriod = Period.ofDays(7);
        Period thirtyWeeksPeriod = Period.ofWeeks(30);
        Period threeMonthsPeriod = Period.ofMonths(3);
        Period eightYearsPeriod = Period.ofYears(8);
        System.out.println(twoYearInterval);
        System.out.println(sevenDaysPeriod);
        System.out.println(thirtyWeeksPeriod);
        System.out.println(threeMonthsPeriod);
        System.out.println(eightYearsPeriod);
        System.out.println(thirtyWeeksPeriod.getMonths());
        System.out.println(Period.between(now,now.plusDays(thirtyWeeksPeriod.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(thirtyWeeksPeriod.getDays()), ChronoUnit.MONTHS));
    }
}
