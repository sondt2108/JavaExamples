package dateAndTime;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

public class dateTime {
    public static void main(String[] args) {

        Date date = new Date();
        String strDateFormat = "HH:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
        // ***********************************************************************
        System.out.println();
        System.out.println("Displaying month name:");

        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt = new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);

        // ***********************************************************************
        System.out.println();
        System.out.println("Display hour and minute:");
        fmt = new Formatter();
        fmt.format("%tl:%tM", cal, cal);
        System.out.println(fmt);

        Calendar now = Calendar.getInstance();
        System.out.println(now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));

        // ***********************************************************************
        System.out.println();
        System.out.println("Displaying date and time:");
        fmt = new Formatter();
        fmt.format("%tc", cal);
        System.out.println(fmt);

        //
        Date d = new Date();
        System.out.println(d.toString());

        // ***********************************************************************
        System.out.println();
        System.out.println("Displaying current time:");

        SimpleDateFormat sdfo = new SimpleDateFormat("h");
        System.out.println("hour in h format : " + sdfo.format(date));

        //
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("kk:mm:ss");
        System.out.println(simpDate.format(d));

        // ***********************************************************************
        System.out.println();
        System.out.println("Formatting months:");

        SimpleDateFormat sdfMMMM = new SimpleDateFormat("MMMM");
        System.out.println("Current Month in MMMM format : " + sdfMMMM.format(date));

        //
        Format formatter = new SimpleDateFormat("MMMM");
        String s = formatter.format(new Date());
        System.out.println(s);

        // ***********************************************************************
        System.out.println();
        System.out.println("Displaying months in short format:");

        String[] shortMonths = new DateFormatSymbols().getShortMonths();

        for (int i = 0; i < (shortMonths.length - 1); i++) {
            String shortMonth = shortMonths[i];
            System.out.println("shortMonth = " + shortMonth);
        }

        //

        String str1 = "dd-MMM-yy";
        Date d1 = Calendar.getInstance().getTime();
        SimpleDateFormat sdf1 = new SimpleDateFormat(str1, Locale.CANADA);
        System.out.println(sdf1.format(d1));
        sdf = new SimpleDateFormat(str1, Locale.ENGLISH);
        System.out.println(sdf1.format(d1));

        // ***********************************************************************
        System.out.println();
        System.out.println("Displaying weekdays:");
        String[] weekdays = new DateFormatSymbols().getWeekdays();

        for (int i = 2; i < (weekdays.length - 1); i++) {
            String weekday = weekdays[i];
            System.out.println("weekday = " + weekday);
        }

        //
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE", Locale.US);
        String str = dateFormat.format(d);
        System.out.println(str);

        // ***********************************************************************
        System.out.println();
        System.out.println("Add time to Date:");

        Calendar cl = Calendar.getInstance();
        cl.setTime(d);
        System.out.println("today is " + d.toString());
        cl.add(Calendar.MONTH, 1);
        System.out.println("date after a month will be " + cl.getTime().toString());
        cl.add(Calendar.HOUR, 70);
        System.out.println("date after 7 hrs will be " + cl.getTime().toString());
        cl.add(Calendar.YEAR, 3);
        System.out.println("date after 3 years will be " + cl.getTime().toString());

        // ***********************************************************************
        System.out.println();
        System.out.println("Display time in VietNamese Language:");

        Locale locVietNam = new Locale("vi");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locVietNam);
        System.out.println("today is " + df.format(d1));

        // ***********************************************************************
        System.out.println();
        System.out.println("Roll through hours & months:");

        cl.setTime(d1);
        System.out.println("today is " + d1.toString());

        cl.roll(Calendar.MONTH, 100);
        System.out.println("date after a month will be " + cl.getTime().toString());

        cl.roll(Calendar.HOUR, 70);
        System.out.println("date after 7 hrs will be " + cl.getTime().toString());

        //
        System.out.println("Time:" + cal.getTime());

        cal.roll(Calendar.YEAR, false);
        System.out.println("Time rolling down the year:" + cal.getTime());

        cal.roll(Calendar.HOUR, true);
        System.out.println("Time rolling up the hour:" + cal.getTime());
    
    
        
    }
}
