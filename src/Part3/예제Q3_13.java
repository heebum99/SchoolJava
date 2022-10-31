package Part3;

// Run Configuration에서 실수와 정수를 섞어서 입력하고 입력된 값을 모두 출력한 후 합계를 출력하도록 수정하시오.

public class 예제Q3_13 {
    public static void main(String[] args) {
        double sum = 0.0;

        System.out.print("명령행 인자:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(Double.parseDouble(args[i])+" ");
            sum += Double.parseDouble(args[i]);
        }
        System.out.println();

        System.out.println("합계:" + sum);
    }
}
