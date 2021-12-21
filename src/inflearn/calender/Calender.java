package inflearn.calender;

import java.util.Scanner;

public class Calender {
    public static int maxDayOfMonth(int month) {
        int[] months = new int[12];

        for (int i = 0; i < 7; i++) {
            if (i == 1) {
                months[i] = 28;
            } else if (i % 2 == 0) {
                months[i] = 31;
            } else {
                months[i] = 30;
            }
        }

        for (int i = 7; i < 12; i++) {
            if (i % 2 == 0) {
                months[i] = 30;
            } else {
                months[i] = 31;
            }
        }

        return months[month - 1];
    }

    public static void main(String[] args) {

        // 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
        // 31일 1, 3, 5, 7, 8, 10, 12
        // 30일 4, 6, 9, 11
        // 28일 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("반복횟수를 입력하세요.");
        int repeat = scanner.nextInt();
        int[] inputValue = new int[repeat];

        System.out.println("월을 입력하세요.");
        for (int i = 0; i < repeat; i++) {
            inputValue[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputValue.length; i++) {
            System.out.printf("%d월은 %d일까지 있습니다. \n", inputValue[i], maxDayOfMonth(inputValue[i]));
        }


        scanner.close();
    }
}
