package inflearn.calender;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 수의 입력을 받는다.
        System.out.println("두 수를 입력하세요.");
        String inputValue = scanner.nextLine();

        String[] splitedValue = inputValue.split(" ");

        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);

        // 두 수의 합을 출력한다.
        System.out.printf("두 수의 합은 %d입니다.", first + second);
        scanner.close();
    }
}
