package inflearn.calender;

import java.util.Scanner;

public class Prompt {
    private final static String PROMPT = "> ";

    public void runPrompt() {
        Scanner scanner = new Scanner(System.in);
        Calender cal = new Calender();

        int month = -1;
        int year = -1;

        while (true) {
            System.out.println("년도를 입력하세요.");
            System.out.print("YEAR" + PROMPT);
            year = scanner.nextInt();
            System.out.println("달을 입력하세요.");
            System.out.print("MONTH" + PROMPT);
            month = scanner.nextInt();
            if (month == -1) {
                break;
            }
            if (month > 12) {
                continue;
            }
            cal.printCalendar(year, month);
        }

        System.out.println("Have a nice day!");
        scanner.close();
    }

    public static void main(String[] args) {
        Prompt p = new Prompt();
        p.runPrompt();
    }
}
