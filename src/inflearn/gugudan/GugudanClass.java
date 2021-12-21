package inflearn.gugudan;

public class GugudanClass {
    public static int[] calculate(int times) {
        int[] results = new int[9];

        for (int i = 0; i < results.length; i++) {
            results[i] = times * (i+1);
        }

        return results;
    }

    public static void print(int[] results) {
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[0] + " * " + (i + 1) + " = " + results[i]);
        }
    }
}
