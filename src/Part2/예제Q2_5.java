package Part2;

import java.util.Scanner;

public class 예제Q2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2018314009 김희범");
        System.out.print("초 단위로 정수를 입력하세요: ");

        int time = scanner.nextInt(); // 정수 입력

        if (time < 0) {
            System.out.println("값을 잘못 입력했습니다.");
            System.exit(0);
        }

        int second = time % 60; // 60으로 나눈 나머지는 초
        int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
        int hour = (time / 60) / 60 % 24; // 60으로 나눈 몫을 다시 60으로 나눈 몫을 24로 나눈 나머지는 시간
        int day = (time / 60 / 60) / 24;

        if (day >= 1) { //24시간이 넘어가는 경우 ~일 ~시간 ~분 ~초 형태로 출력
            System.out.println(day+"일, "+hour+"시간, "+minute+"분, "+second+"초입니다.");
        }
        else{
            System.out.println(hour+"시간, "+minute+"분, "+second+"초입니다.");
        }

        scanner.close();
    }
}
