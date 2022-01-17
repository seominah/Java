package inflearn.calender;

import com.sun.codemodel.internal.JCase;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
    private final static String PROMPT = "> ";
    private final static String[] WEEKDAYS = {"su", "mo", "tu", "wd", "th", "fr", "sa"};

    public void printMenu() {
        System.out.println("+----------------------+");
        System.out.println("| 1. 일정 등록");
        System.out.println("| 2. 일정 검색");
        System.out.println("| 3. 달력 보기");
        System.out.println("| h. 도움말");
        System.out.println("| q. 종료");
        System.out.println("+----------------------+");
    }

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

    public void runPrompt() throws ParseException {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        Calender cal = new Calender();


        boolean isLoop = true;
        while (isLoop) {
            System.out.println("명령 (1, 2, 3. h, q)" + PROMPT);
            String cmd = scanner.nextLine();
            switch (cmd) {
                case "1":
                    cmdRegister(scanner, cal);
                    break;
                case "2":
                    cmdSearch(scanner, cal);
                    break;
                case "3":
                    cmdCal(scanner, cal);
                    break;
                case "h":
                    printMenu();
                    break;
                case "q":
                    isLoop = false;
                    break;
            }
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }

    private void cmdRegister(Scanner scanner, Calender cal) {
        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd)");
        String date = scanner.next();
        scanner.nextLine();
        System.out.println("일정을 입력해 주세요.");
        String text = scanner.nextLine();

        cal.registerPlan(date, text);
    }

    private void cmdSearch(Scanner scanner, Calender cal) {
        System.out.println("[일정 검색]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd)");
        String date = scanner.next();
        PlanItem plan = cal.searchPlan(date);

        if (plan != null) {
            System.out.println(plan.detail);
        } else {
            System.out.println("일정이 없습니다.");
        }
    }

    private void cmdCal(Scanner scanner, Calender cal) {
        int month = 1;
        int year = 2022;

        System.out.println("년도를 입력하세요. (exit : -1)");
        System.out.print("YEAR" + PROMPT);
        year = scanner.nextInt();

        System.out.println("달을 입력하세요.");
        System.out.print("MONTH" + PROMPT);
        month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("잘못 입력하셔습니다. 다시 입력하세요.");
            return;
        }
        cal.printCalendar(year, month);
    }

    public static void main(String[] args) throws ParseException {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
