package inflearn.gugudan.missions;

import java.util.Scanner;

public class GugudanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String inputValue;

        // 사용자가 입력한 값의 단까지 계산하여 출력
        // 8 입력 시 2 * 1 ~ 8 * 8까지
        // 19 입력 시 2 * 1 ~ 19 * 19까지
        System.out.print("2단에서 부터 출력할 단은? : ");
        number = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= number; i++) {
            int[] results = Gugudan.calculate(i, number);
            System.out.println(i+ "단");
            Gugudan.print(results);
        }

        // 2단 부터 사용자가 입력한 첫번째 값의 단까지 두번째 값까지 계산하여 출력
        // 8,7 입력 시 2 * 1 ... 2 * 7 ... 3 * 7 ... 8 * 7 까지
        System.out.print("구구단 중 원하는 단과 출력할 범위의 값은 ? : ");
        inputValue = scanner.nextLine();

        String[] splitValue = inputValue.split(",");

        int first = Integer.parseInt(splitValue[0]);
        int second = Integer.parseInt(splitValue[1]);

        for (int i = 2; i <= first; i ++) {
            int[] results = new int[second];
            for (int j = 0; j < second; j++) {
                results[j] = i * (j + 1);
            }
            System.out.println(i + "단");
            Gugudan.print(results);
        }
    }
}
