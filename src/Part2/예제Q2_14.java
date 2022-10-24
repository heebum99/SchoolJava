package Part2;

import java.util.Scanner;

public class 예제Q2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade, gAdd;
        System.out.print("점수를 입력하세요(0~100): ");

        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("입력을 잘못했습니다.");
            System.exit(0);
        }

        switch (score / 5) {
            case 20: // score = 100
            case 19: // score는 95~99
                grade = 'A';
                gAdd = '+';
                break;
            case 18: // score는 94~90
                grade = 'A';
                gAdd = '0';
                break;
            case 17: // score는 85~89
                grade = 'B';
                gAdd = '+';
                break;
            case 16: // score는 84~80
                grade = 'B';
                gAdd = '0';
                break;
            case 15:
                grade = 'C';
                gAdd = '+';
                break;
            case 14:
                grade = 'C';
                gAdd = '0';
                break;
            default: // score는 59 이하
                grade = 'F';
                gAdd = ' ';
        }

        System.out.println("학점은 " + grade +gAdd+ "입니다");

        scanner.close();
    }
}
