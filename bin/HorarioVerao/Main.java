package HorarioVerao;

import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Example date format to arg: 05/12/2019");
            String datenow = "";
            if (args == null || args.length == 0){
                datenow = "05/12/2019";
            } else {
                datenow =  args[0];
            }
            System.out.println("Using date: " + datenow);
            final SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
            final Date date = parser.parse(datenow); // 5th of december

            System.out.println("Is in Daylight Saving Time in this time zone? "
                    + TimeZone.getTimeZone("America/Sao_Paulo").inDaylightTime(date));
            // DEBUG
            // System.out.println(TimeZone.getTimeZone("America/Sao_Paulo"));
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
    }
}
