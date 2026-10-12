import java.time.*;
import java.time.format.*;

public class agecal{
    public static void main(String args[]){
        LocalDate a = LocalDate.ofYearDay(2026,06);
        LocalDate ag = a.minusYears(2007);
        System.out.println("present your age is:"+a);
        System.out.println("present your age is;"+ag);

    }
}