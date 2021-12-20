package inflearn;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        /*
        // 2단
        // 0 ~ 9까지 반복한다.
        for(int i = 1; i < 10; i++) {
            // 2의 배수 9개의 값을 출력한다.
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        // 3단
        // 0 ~ 9까지 반복한다.
        for(int i = 1; i < 10; i++) {
            // 3의 배수 9개의 값을 출력한다.
            System.out.println("3 * " + i + " = " + 3 * i);
        }

        // 4단 ~ 5단
        // 입력값 받기
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number + " * 1 = " + number * 1);
        System.out.println(number + " * 2 = " + number * 2);
        System.out.println(number + " * 3 = " + number * 3);
        System.out.println(number + " * 4 = " + number * 4);
        System.out.println(number + " * 5 = " + number * 5);
        System.out.println(number + " * 6 = " + number * 6);
        System.out.println(number + " * 7 = " + number * 7);
        System.out.println(number + " * 8 = " + number * 8);
        System.out.println(number + " * 9 = " + number * 9);


        // 6단
        // 변수 i를 1로 초기화 한다.
        int i = 1;
        // i가 10 미만 일경우 반복문을 종료한다.
        while (i < 10) {
            // 6의 배수 9개의 값을 출력한다.
            System.out.println("6 * " + i + " = " + 6 * i);
            // i의 값이 1 증가한다.
            i++;
        }

        // 7단
        for (int j = 1; j < 10; j++) {
            // 7의 배수 9개의 값을 출력한다.
            System.out.println("7 * " + j + " = " + 7 * j);
        }
        */

        // 8단 ~ 9단
        // 입력값 받기
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + "단");
        if (number >= 2 && number <= 9) {
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        } else {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        }

    }
}
