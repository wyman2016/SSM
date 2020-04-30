package com.admin.ssm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String date2String(Date date, String time) {
        SimpleDateFormat sdf = new SimpleDateFormat(time);
        String format = sdf.format(date);
        return format;
    }

    public static Date string2Date(String date, String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(time);
        Date format = sdf.parse(date);
        return format;
    }
}
