package Part3;

import java.util.Random;
import java.util.Scanner;

public class OpenChallenge3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int min, max;

        while (true) {
            int num = random.nextInt(100);//0~99까지 임의의 정수 생성

            min = 0;
            max = 99;
            int cnt = 1;

            System.out.println("수를 결정했습니다. 맞춰보세요");
            System.out.println(min + "~" + max);

            System.out.print(cnt + ">>");
            int input = scanner.nextInt();

            while (num != input) {

                if (num > input) {
                    System.out.println("더 높게");
                    min = input;
                    System.out.println(min + "~" + max);
                } else {
                    System.out.println("더 낮게");
                    max = input;
                    System.out.println(min + "~" + max);
                }

                cnt++;
                System.out.println(cnt + ">>");
                input = scanner.nextInt();

            }

            System.out.println("맞았습니다.");
            System.out.println("다시하시겠습니까(y/n)>>");
            String select = scanner.next();

            if (select.equals("n")) {
                break;
            }
        }
    }
}
