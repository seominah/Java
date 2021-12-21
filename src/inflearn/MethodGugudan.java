package inflearn;

public class MethodGugudan {
    // 구구단 계산 결과를 배열에 담는 메소드
    public static int[] calculate(int times) {
        int[] results = new int[9];

        for (int i = 0; i < results.length; i++) {
            results[i] = times * (i + 1);
        }

        return results;
    }

    // 배열의 데이터를 출력하는 메서드
    public static void print(int[] results) {
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[0] + " * " + (i+1) + " = " + results[i]);
        }
    }


    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] results = calculate(i);
            System.out.println(i + "단");
            print(results);
        }
    }
}
