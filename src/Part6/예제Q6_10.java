package Part6;

import java.util.Scanner;

public class 예제Q6_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.올림, 2.내림, 3.제곱근, 4.e의 지수승, 5.반올림 >> ");
        int select = scanner.nextInt();
        System.out.print("실수 값 하나를 입력하세요 >> ");
        double num = scanner.nextDouble();

        switch (select) {
            case 1:
                System.out.println(num + "의 올림 값은 " + Math.ceil(num) + "입니다.");
                break;
            case 2:
                System.out.println(num + "의 내림 값은 " + Math.floor(num) + "입니다.");
                break;
            case 3:
                System.out.println(num + "의 제곱근 값은 " + Math.sqrt(num) + "입니다.");
                break;
            case 4:
                System.out.println("e의 " + num + "승 값은 " + Math.exp(num) + "입니다.");
                break;
            case 5:
                System.out.println(num + "의 반올림 값은 " + Math.round(num) + "입니다.");
                break;
            default:
                System.out.println("다시 번호를 입려해주세요.");
                System.exit(0);
        }
//        double a = 4.3;
//        System.out.println(Math.PI); //원주율 상수 출력
//        System.out.println(Math.ceil(a)); //ceil(올림)
//        System.out.println(Math.floor(a)); //floor(내림)
//        System.out.println(Math.sqrt(9)); //제곱근
//        System.out.println(Math.exp(2)); //e의2승
//        System.out.println(Math.round(3.14)); //반올림

        //1~45사이의 정수형 난수 5개 발생
        System.out.println("이번주 행운의 번호는 ");
        for (int i = 0; i < 5; i++) {
            System.out.print((int) (Math.random() * 45 + 1) + " ");
        }
    }
}
