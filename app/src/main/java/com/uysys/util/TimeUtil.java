package com.uysys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    public  static String GET_TIME(String formatInput,String formatOutput,String inptDateString)//"DD-MM-yyyy HH:mm:ss"
    {

        try {
        String datestring=inptDateString;
        Date date1= null;

            date1 = new SimpleDateFormat(formatInput).parse(datestring);

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date1);


            SimpleDateFormat df = new SimpleDateFormat(formatOutput);
            String formattedDate = df.format(calendar.getTime());
            return formattedDate;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }
}
