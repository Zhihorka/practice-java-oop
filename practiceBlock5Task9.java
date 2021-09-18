import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class practiceBlock5Task9 {

    public static String timeDifference(String city, String enterDate, String newCity){SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy HH:mm", Locale.ENGLISH);
        Date date = new Date();
        SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {date = formatter.parse(enterDate);}
        catch (ParseException e) {e.printStackTrace();}
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        switch (city) {
            case "Los Angeles"  : {calendar.add(Calendar.HOUR, 8);break;}
            case "New York"     : {calendar.add(Calendar.HOUR, 5);break;}
            case "Caracas"      : {calendar.add(Calendar.HOUR, 4);calendar.add(Calendar.MINUTE, 30);break;}
            case "Buenos Aires" : {calendar.add(Calendar.HOUR, 3);break;}
            case "London"       : {break;}
            case "Rome"         : {calendar.add(Calendar.HOUR, -1);break;}
            case "Moscow"       : {calendar.add(Calendar.HOUR, -3);break; }
            case "Tehran"       : {calendar.add(Calendar.HOUR, -3);calendar.add(Calendar.MINUTE, -30);break; }
            case "New Delhi"    : {calendar.add(Calendar.HOUR, -5);calendar.add(Calendar.MINUTE, -30);break; }
            case "Beijing"      : {calendar.add(Calendar.HOUR, -8);break; }
            case "Canberra"     : {calendar.add(Calendar.HOUR, -10);break; }
        }
        switch (newCity) {
            case "Los Angeles"  : {calendar.add(Calendar.HOUR, -8);break; }
            case "New York"     : {calendar.add(Calendar.HOUR, -5);break; }
            case "Caracas"      : {calendar.add(Calendar.HOUR, -4);calendar.add(Calendar.MINUTE, -30);break; }
            case "Buenos Aires" : {calendar.add(Calendar.HOUR, -3);break; }
            case "London"       : {break; }
            case "Rome"         : {calendar.add(Calendar.HOUR, 1);break; }
            case "Moscow"       : {calendar.add(Calendar.HOUR, 3);break; }
            case "Tehran"       : {calendar.add(Calendar.HOUR, 3);calendar.add(Calendar.MINUTE, 30);break; }
            case "New Delhi"    : {calendar.add(Calendar.HOUR, 5);calendar.add(Calendar.MINUTE, 30);break; }
            case "Beijing"      : {calendar.add(Calendar.HOUR, 8);break; }
            case "Canberra"     : {calendar.add(Calendar.HOUR, 10);break; }
        }
        Date ad = calendar.getTime();
        return fo.format(ad);
    }

    public static void main(String[] args) {
        System.out.println(timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra") );
        System.out.println(timeDifference("London", "July 31, 1983 23:01", "Rome"));
        System.out.println(timeDifference("New York", "December 31, 1970 13:40", "Beijing") );
    }
}
