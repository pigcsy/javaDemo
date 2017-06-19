package com.util.dateutil;

import java.util.Calendar;

/**
 * 日期工具
 *
 * @author 轴承
 * @date 2016/11/18 上午11:11
 */
public class CalendarTools {

    //  if (request.getScoreTime() != null) {
    // query.setScoreTime(request.getScoreTime());
    // query.setScoreTimes(CalendarTools.buildTime(CalendarTools.lastDayOfMonth(request.getScoreTime().getTime()), CalendarTools.END_TIME).getTime());
    //  } else {
    // query.setScoreTime(CalendarTools.buildTime(CalendarTools.firstDayOfMonth(), CalendarTools.START_TIME).getTime());
    // query.setScoreTimes(CalendarTools.buildTime(CalendarTools.lastDayOfMonth(), CalendarTools.END_TIME).getTime());
    // }


    public static final String START_TIME = "0"; // 开始时间
    public static final String END_TIME = "1"; // 结束时间


    /**
     * 今日
     *
     * @return
     */
    public static Calendar today() {
        return Calendar.getInstance();
    }

    /**
     * 本周的第一天 <br/>
     * 中国的一周第一天
     *
     * @return
     */
    public static Calendar firstDayOfWeek() {
        Calendar calendar = today();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return calendar;
    }

    /**
     * 本周的最后一天 <br/>
     * 本周周日
     *
     * @return
     */
    public static Calendar lastDayOfWeek() {
        Calendar calendar = today();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY); // 上周日[国外为 本周周日]
        calendar.add(Calendar.WEEK_OF_YEAR, 1); // 加一周,为中国的周日
        return calendar;
    }

    /**
     * 月初
     *
     * @return
     */
    public static Calendar firstDayOfMonth() {
        Calendar calendar = today();
        return firstDayOfMonth(calendar);
    }

    /**
     * 月初
     *
     * @param times
     * @return
     */
    public static Calendar firstDayOfMonth(long times) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(times);
        return firstDayOfMonth(calendar);
    }

    /**
     * 月初
     *
     * @param calendar
     * @return
     */
    public static Calendar firstDayOfMonth(Calendar calendar) {
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        return calendar;
    }

    /**
     * 月末
     *
     * @return
     */
    public static Calendar lastDayOfMonth() {
        Calendar calendar = today();
        return lastDayOfMonth(calendar);
    }

    /**
     * 月末
     *
     * @param calendar
     * @return
     */
    public static Calendar lastDayOfMonth(Calendar calendar) {
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar;
    }

    /**
     * 月末
     *
     * @param times
     * @return
     */
    public static Calendar lastDayOfMonth(long times) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(times);
        return lastDayOfMonth(calendar);
    }

    /**
     * 年初
     *
     * @return
     */
    public static Calendar firstDayOfYear() {
        Calendar calendar = today();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMinimum(Calendar.DAY_OF_YEAR));
        return calendar;
    }

    /**
     * 年末
     *
     * @return
     */
    public static Calendar lastDayOfYear() {
        Calendar calendar = today();
        calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
        return calendar;
    }

    /**
     * 设置目标时间的时分秒[毫秒]
     *
     * @param calendar
     * @param hour
     * @param minute
     * @param second
     * @param milliSecond
     * @return
     */
    public static Calendar buildTime(Calendar calendar, int hour, int minute, int second, int milliSecond) {
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, milliSecond);
        return calendar;
    }

    /**
     * 设置目标时间的时分秒[毫秒] <br/>
     * <pre>
     *     开始时间 : YYYY-MM-dd 00:00:00
     *     结束时间 : YYYY-MM-dd 23:59:59
     * </pre>
     *
     * @param calendar
     * @param type     0 开始时间 1结束时间
     * @return
     */
    public static Calendar buildTime(Calendar calendar, String type) {
        switch (type) {
            case START_TIME:
                return buildTime(calendar, 0, 0, 0, 0);
            case END_TIME:
                return buildTime(calendar, 23, 59, 59, 999);
            default:
                break;
        }
        return calendar;
    }
}
