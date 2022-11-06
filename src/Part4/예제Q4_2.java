package Part4;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public int getArea() {
        return width * height;
    }
}

public class 예제Q4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("정사각형 한 변의 길이를 입력하세요 >> ");

        rect.width = scanner.nextInt();
        rect.height = rect.width;

        System.out.println("정사각형의 면적은 "+rect.getArea());
        scanner.close();
    }
}
