package utilities;

import pages.US11ElementPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    // MMMM dd, yyy  --> February 17, 2019
    public static String todaysDate(){
        String today = new SimpleDateFormat("MMMM dd, yyy").format(new Date());
        return today;
    }
    // MM-dd-yy     --> 02-17-19
    public static String todaysDate2(){
        String today = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
        return today;
    }
    // dd-MM-yy    --> 17-02-19
    public static String todaysDate3(){
        String today = new SimpleDateFormat("dd-MM-yy").format(new Date());
        return today;
    }
    // yyyy-MM-dd hh:mm:ss   --> 2019-02-17 03:45:11
    public static String todaysDate4(){
        String today = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        return today;
    }
    // MM-dd-yyyy hh:mm   --> 02-17-2019 03:45
    public static String getTimeNow(){
        String rightNow = new SimpleDateFormat("MM-dd-yyyy hh:mm").format(new Date());
        return rightNow;
    }


    public static String toDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return dateFormat.format(cal.getTime());
    }
    public static void expectedDateFormat(){
        US11ElementPage us11ElementPage = new US11ElementPage();
        String actualDate = us11ElementPage.createDateBox.getAttribute("value");
        String day, month, year,getYear;
        month = actualDate.substring(0,2);  day = actualDate.substring(2,4);
        String arr[] = actualDate.split("-");
        for (String tempDate : arr){
            System.out.println(tempDate);
        }


    }


}


