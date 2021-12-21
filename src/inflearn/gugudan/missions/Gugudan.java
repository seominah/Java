package inflearn.gugudan.missions;

public class Gugudan {
    // 입력값 * 입력값 단까지 계산 결과를 배열에 담는 메소드
    public static int[] calculate(int number, int times) {
        int[] results = new int[times];
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 1);
        }
        return results;
    }

    public static void print(int[] results) {
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[0] + " * " + (i + 1) + " = " + results[i]);
        }
    }
}
