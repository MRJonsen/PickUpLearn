package thread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/4/12
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            String start = "2019-04-01";
//            String end = "2019-04-12";
//            Date dBegin = sdf.parse(start);
//            Date dEnd = sdf.parse(end);
//            System.out.println(getDutyDays("2019-04-01","2019-04-14","yyyy-MM-dd", "yyyy-MM-dd"));
//            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//            Date parse = sdf1.parse("2019-04-01 07:00");
            SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm");
//            String format = sdf2.format(parse);
//            Date parse1 = sdf2.parse("17:00");
//            System.out.println(parse1);
//            System.out.println(format);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static List<String> getDutyDays(String startDateTime, String endDateTime, String format, String backFormat) {
        List<String> strings = new ArrayList<String>();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            SimpleDateFormat df = new SimpleDateFormat(backFormat);
            Date startDate = sdf.parse(startDateTime);
            Date endDate = sdf.parse(endDateTime);
            while (startDate.compareTo(endDate) <= 0) {
                if (startDate.getDay() != 6 && startDate.getDay() != 0)
                    strings.add(df.format(startDate.getTime()));
                startDate.setDate(startDate.getDate() + 1);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return strings;

    }
}
