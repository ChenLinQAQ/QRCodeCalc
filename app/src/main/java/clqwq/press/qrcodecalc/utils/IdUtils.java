package clqwq.press.qrcodecalc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdUtils {

    public static String getIdByTime() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        return format.format(date);
    }

    public static void main(String[] args) {
        System.out.println(getIdByTime());
    }
}
