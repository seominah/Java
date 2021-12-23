package inflearn.calender;

import java.util.Scanner;

public class Prompt {
    private final static String PROMPT = "> ";
    private final static String[] WEEKDAYS = {"su", "mo", "tu", "wd", "th", "fr", "sa"};

    public int parseWeekDay(String weekDay) {
        int num = 0;
        for (int i = 0; i < WEEKDAYS.length; i++) {
            if (weekDay.equals(WEEKDAYS[i])) {
                num = i;
                break;
            }
        }
        return num;
    }

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calender cal = new Calender();

        int month = 1;
        int year = 0;
        int weekDay = 0;

        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.print("YEAR" + PROMPT);
            year = scanner.nextInt();
            if (year == -1) break;

            System.out.println("달을 입력하세요.");
            System.out.print("MONTH" + PROMPT);
            month = scanner.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("잘못 입력하셔습니다. 다시 입력하세요.");
                continue;
            }

            scanner.nextLine();
            System.out.print("첫째 날의 요일을 입력하세요.(su, mo, tu, wd, th, fr, sa)" + PROMPT);
            String strWeekDay = scanner.nextLine();
            weekDay = parseWeekDay(strWeekDay);

            cal.printCalendar(year, month, weekDay);
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
