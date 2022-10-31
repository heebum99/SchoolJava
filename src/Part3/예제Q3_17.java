package Part3;

//양수 3개를 입력 받아 입력 받은 3개의 양수와 합계를 출력하도록 수정하시오
//정수가 아닌 문자를 입력할 때는 기존 프로그램과같이 진행하고, 0이나 음수가 입력된 경우에는 “양수를 입력하세요” 라는 메시지 출력 후 재 입력

import java.util.InputMismatchException;
import java.util.Scanner;

public class 예제Q3_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");
        int sum = 0, n = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(i + ">>");
            try {
                n = scanner.nextInt(); // 정수 입력
                if (n <= 0) {
                    System.out.println("양수를 입력하세요.");
                    i--;
                }
            } catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
                i--; // 인덱스가 증가하지 않도록 미리 감소
                continue; // 다음 루프
            }
            sum += n; // 합하기
        }
        System.out.println("합은 " + sum);
        scanner.close();
    }
}
