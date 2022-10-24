package Part2;

import java.util.Scanner;

public class 예제Q2_8 {
    public static void main(String[] args) {
        System.out.println("2018314009 김희범");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+"과 "+b+"의 차는 " + ((a > b) ? (a - b) : (b - a))+"입니다.");
    }
}
