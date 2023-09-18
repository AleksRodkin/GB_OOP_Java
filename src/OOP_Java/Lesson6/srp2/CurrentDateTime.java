package OOP_Java.Lesson6.srp2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CurrentDateTime {
    public static Date date = Calendar.getInstance().getTime();
    public static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
    public static String strDate = dateFormat.format(date);

}
