package thread;


import com.sun.java.swing.plaf.windows.WindowsMenuUI;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by chenbin on 2018/9/21.
 */
public class Demo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

//
        try {
//            Date dBegin = sdf.parse(start);
//            Date dEnd = sdf.parse(end);
//            List<Date> lDate = findDates(dBegin, dEnd);
//            for (Date date : lDate) {
//                System.out.println(sdf.format(date));
//            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String start = "2014-02-01";
            String end = "2014-03-02";
            Date dBegin = sdf.parse(start);
            Date dEnd = sdf.parse(end);
            getBetweenDates(dBegin,dEnd,"yyyy-MM-dd");
        }catch (Exception e){

        }
    }

    public static List<String> findDates(Date dBegin, Date dEnd,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        List lDate = new ArrayList<String>();
        lDate.add(dBegin);
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime())) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(calBegin.getTime());
        }
        return lDate;
    }

//        WindowsMenuUI windowsMenuUI = new WindowsMenuUI();
//        ThreadDemo threadDemo = new ThreadDemo();
//        ThreadDemo threadDemo2 = new ThreadDemo();
//        ThreadDemo threadDemo1 = new ThreadDemo();
//        threadDemo.start();
//        threadDemo1.start();
//        threadDemo2.start();
//         String name = getName();
//        System.out.println(countWorkDay("2019-04","yyyy-MM","yyyy-MM-dd"));
//        try{
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date parse = simpleDateFormat.parse("2019-03-21");
//            List<Date> betweenDates = getBetweenDates(parse, new Date());
//            System.out.println(betweenDates);
//        }catch (Exception e){
//
//        }
//    }


    public static String getName() {
        System.out.println("nama");
        return "haha";
    }


    public static List<String> countWorkDay(String time, String format,String backFormat) {
        List<String> dateList = new ArrayList<>();
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            SimpleDateFormat sdf1 = new SimpleDateFormat(backFormat);
            java.util.Date parse = sdf.parse(time);
            Date date = new Date();
            String formatStr =sdf.format(date);
            System.out.println(formatStr);//2017-九月-15 13:17:08:355
            Calendar c = Calendar.getInstance();
            c.setTime(parse);
            // 当月最后一天的日期
            int max = date.getDate();
            if (date.getMonth()!=parse.getMonth()){
                max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
                // 开始日期为1号
                int start = 1;
                while (start <= max) {
                    c.set(Calendar.DAY_OF_MONTH, start);
                    if (isWorkDay(c)) {
                        dateList.add(sdf1.format(c.getTime()));
                    }
                    start++;
                }
                return dateList;
            }else {
                // 开始日期为1号
                int start = 1;
                while (start < max) {
                    c.set(Calendar.DAY_OF_MONTH, start);
                    if (isWorkDay(c)) {
                        dateList.add(sdf1.format(c.getTime()));
                    }
                    start++;
                }
                return dateList;
            }
        }catch (Exception e){

        }
        return  dateList;
    }

    // 判断是否工作日（未排除法定节假日，由于涉及到农历节日，处理很麻烦）
    public static boolean isWorkDay(Calendar c) {
        // 获取星期,1~7,其中1代表星期日，2代表星期一 ... 7代表星期六
        int week = c.get(Calendar.DAY_OF_WEEK);
        // 不是周六和周日的都认为是工作日
        return week != Calendar.SUNDAY && week != Calendar.SATURDAY;
    }

    public   static List<String>  getBetweenDates(Date start, Date end,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        List<String> result = new ArrayList<String>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(start);
        tempStart.add(Calendar.DAY_OF_YEAR, 1);

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(end);
        while (tempStart.before(tempEnd)) {
            result.add(sdf.format(tempStart.getTime()));
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
        }
        return result;
    }



}
