package com.bridgeit.utility;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
    }

}
