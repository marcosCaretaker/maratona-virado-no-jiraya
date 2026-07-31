package academy.marcoscaretaker.maratonajava.javacore.Rdates.exercices;

import java.time.DayOfWeek;
import java.time.temporal.*;

public class NextWorkday01 implements TemporalAdjuster {
    //Given a specific date, you must return the next business day following that date.

    @Override
    public Temporal adjustInto(Temporal temporal) {
        Temporal plussed = temporal.plus(1, ChronoUnit.DAYS);
        switch (plussed.get(ChronoField.DAY_OF_WEEK)){
            case 5:
            case 6:
            case 7:
                return plussed.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            case 1:
            case 2:
            case 3:
            case 4:
                return plussed;
        }
        return null;
    }
}
