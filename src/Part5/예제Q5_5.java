package Part5;

import java.util.Scanner;

class Shape { //슈퍼 클래스
    public Shape next;

    public Shape() {
        next = null;
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { //메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class 예제Q5_5 {
    static void paint(Shape p) {
        p.draw(); //동적바인딩
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Line 2.Circle 3.Rect >> ");

        Shape start = null, last = null, obj = null;
        int cnt = 0;

        while (cnt < 4) {
            cnt++;
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    obj = new Line();
                    break;
                case 2:
                    obj = new Circle();
                    break;
                case 3:
                    obj = new Rect();
                    break;
                default:
                    System.out.println("다시 번호를 입력해주세요");
                    cnt--;
                    continue;
            }
            if (start == null) {
                start = obj;
                last = start;
            } else {
                last.next = obj;
                last = last.next;
            }
        }

        // 모든 도형 출력
        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.next;
        }
    }
}
