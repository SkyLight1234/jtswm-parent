package com.zdpzsp.frame.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 中国星期格式工具
 */
public class ChineseWeekUtil {

    /**
     * 获取星期
     *
     * <p>周一至周日分别对于1-7</p>
     * @param date
     * @return
     */
    public static int getChineseWeekDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        if(weekday == 1){
            return 7;//周日
        }
        return weekday - 1;
    }

    /**
     * 获取今天以及后面的天数
     *
     * @param total 含今天的数量
     * @return
     */
    public static List<Date> getTodayAndAfterDay(Integer total){
        return getDateAfterTotalDay(new Date(),total);
    }

    /**
     * 获取指定日期以及后面的天数
     * @param date 指定时间
     * @param total 含指定的数量
     * @return
     */
    public static List<Date> getDateAfterTotalDay(Date date,Integer total){
        List<Date> dates = new ArrayList<Date>();
        Calendar calendar = Calendar.getInstance();
        date.setTime(date.getTime());
        for(int i = 0 ; i < total;++i){
            if(i != 0){
                calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH) + 1);
            }

            dates.add(calendar.getTime());
        }

        return dates;
    }

    /**
     * 根据weekFlag获取日期
     * @param weekFlag
     * @return
     */
    public static Date getDateByWeekDay(Integer weekFlag){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH) + 1);
        List<Date> days = getDateAfterTotalDay(calendar.getTime(),7);
        for (Date d : days){
            if(getChineseWeekDay(d) == weekFlag){
                return d;
            }
        }
        return null;
    }
}
