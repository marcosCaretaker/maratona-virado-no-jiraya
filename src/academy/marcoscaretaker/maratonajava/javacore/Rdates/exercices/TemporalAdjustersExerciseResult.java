package academy.marcoscaretaker.maratonajava.javacore.Rdates.exercices;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TemporalAdjustersExerciseResult {
    public static void main(String[] args) {
        NextWorkday01 nextWorkday = new NextWorkday01();
        LocalDate now = LocalDate.now();
        //now = now.plus(1,ChronoUnit.DAYS); // USE THIS IF YOU WANT TO CHANGE THE DATE SO IT'S DIFFERENT FROM TODAY
        LocalDate nextWorkdayDate = now.with(nextWorkday);
        System.out.println("Day of the week based on the date provided: "+now.getDayOfWeek());
        System.out.println("Next business day following the date provided: "+nextWorkdayDate.getDayOfWeek());
    }
}
