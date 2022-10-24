package Part2;

import java.util.Scanner;

public class 예제Q2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴: 1.에스프레소, 2.카푸치노, 3.카페라떼, 4.아메리카노");
        System.out.print("1~4번 메뉴중 선택해주세요. ");

        int order = scanner.nextInt();

        String menu = "";
        int price = 0;

        switch (order) {
            case 1:
                menu = "에스프레소";
                price = 3500;
                break;
            case 2:
                menu = "카푸치노";
                price = 3500;
                break;
            case 3:
                menu = "카페라떼";
                price = 3500;
                break;
            case 4:
                menu = "아메리카노";
                price = 2000;
                break;
            default:
                System.out.println("메뉴에 없습니다!");
                System.exit(0);
        }

        if (price != 0) {
            System.out.print(menu + "는 " + price + "원입니다");
        }

        scanner.close();
    }
}
