package inflearn.gugudan;

public class GugudanMain {
    public static void main(String[] args){
        for (int i = 2; i < 10; i++) {
            int[] results = GugudanClass.calculate(i);
            System.out.println(i + "단");
            GugudanClass.print(results);
        }
    }
}
