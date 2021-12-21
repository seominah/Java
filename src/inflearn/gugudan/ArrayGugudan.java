package inflearn.gugudan;

public class ArrayGugudan {
    public static void main(String[] args) {
        // 크기가 9인 배열을 생성한다.
        int[] results = new int[9];

        // results 배열의 크기만큼 반복한다.
        for (int i = 0; i < results.length; i++) {
            // 0 ~ 8까지 배열에 값을 초기화한다.
            results[i] = 2 * (i + 1);
        }

        // results 배열의 크기만큼 반복한다.
        for (int i = 0; i < results.length; i++) {
            // 0 ~ 8까지 배열의 값을 출력한다.
            System.out.println("2 * " + (i + 1) + " = " + results[i]);
        }

        // results 변수에 새로운 배열을 생성한다.
        results = new int[9];

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 0; j < results.length; j++) {
                results[j] = i * (j + 1);
                System.out.println(i + " * " + (j + 1) + " = " + results[j]);
            }
        }
    }
}
