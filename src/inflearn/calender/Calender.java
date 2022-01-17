package inflearn.calender;

import java.io.*;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Calender {
    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final String SAVE_FILE = "calender.dat";

    private HashMap<Date, PlanItem> planMap;

    public Calender() {
        planMap = new HashMap<Date, PlanItem>();
        File f = new File(SAVE_FILE);
        if (!f.exists()) {
            return;
        }
        try {
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                String line = s.nextLine();
                String[] words = line.split(",");
                String date = words[0];
                String detail = words[1].replace("\"", "");
                PlanItem p = new PlanItem(date, detail);
                planMap.put(p.getDate(), p);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // date : "2022-01-20"
    public void registerPlan(String strDate, String plan){
        PlanItem p = new PlanItem(strDate, plan);
        planMap.put(p.getDate(), p);

        File f = new File(SAVE_FILE);
        String item = p.saveString();

        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(item);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PlanItem searchPlan(String strDate){
        Date date = PlanItem.getDateFromString(strDate);
        return planMap.get(date);
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        else
            return false;
    }

    public int getMaxDayOfMonth(int year, int month) {
        if (isLeapYear(year))
            return LEAP_MAX_DAYS[month - 1];
        else
            return MAX_DAYS[month - 1];
    }

    public void printCalendar(int year, int month) {
        System.out.printf("      <<%d,%d>>\n", year, month);
        System.out.println(" su  mo  tu  wd  th  fr  sa");
        System.out.println("---------------------------");

        // get weekday automatically
        int weekDay = getWeekDay(year, month, 1);

        int maxDay = getMaxDayOfMonth(year, month);
        int count = 7 - weekDay;
        int delim = count == 7 ? 0 : count;

        // print first line
        for (int i = 0; i < weekDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= count; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // print second line ~ last line
        count++;
        for (int i = count; i <= maxDay; i++) {
            System.out.printf("%4d", i);
            if (i % 7 == delim) {
                System.out.println();
            }
        }
        System.out.println();

    }

    public int getWeekDay(int year, int month, int day) {
        // 1970.Jan.1st.Thursday
        int standardYear = 1970;
        final int STANDARD_WEEKDAY = 4;

        int count = 0;

        for (int i = standardYear; i < year; i++) {
            int delta = isLeapYear(i) ? 366 : 365;
            count += delta;
        }

        for (int i = 1; i < month; i++) {
            int delta = getMaxDayOfMonth(year, i);
            count += delta;
        }

        count += day - 1;

        int weekDay = (count + STANDARD_WEEKDAY) % 7;

        return weekDay;
    }

    // simple test code
    public static void main(String[] args) throws ParseException {
        Calender cal = new Calender();

        cal.registerPlan("2017-06-23", "Study");
        System.out.println(cal.searchPlan("2017-06-23").equals("Study"));
    }

}
