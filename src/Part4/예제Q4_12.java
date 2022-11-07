package Part4;

import java.util.Scanner;

class CurrencyConverter {
    private static double rate; //원화에 대한 환율

    public static double toDollar(double won) {
        return won / rate;
    }

    public static double toKWR(double dollar) {
        return dollar * rate;
    }

    public static void setRate(double r) {
        rate = r;
    }
}

public class 예제Q4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러)>> ");
        double rate = scanner.nextDouble();

        CurrencyConverter.setRate(rate);
        System.out.print("한화 금액 입력 >> ");
        double won = scanner.nextDouble();
        System.out.print("달러 금액 입력 >> ");
        double dollar = scanner.nextDouble();

        System.out.println(won+"원은 "+CurrencyConverter.toDollar(won)+"달러입니다.");
        System.out.println(dollar+"달러는 "+CurrencyConverter.toKWR(dollar)+"원입니다.");
    }
}
