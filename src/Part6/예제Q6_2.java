package Part6;

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() { //toString 메소드 오버라이딩
        return "Point(" + x + "," + y + ")";
    }
}

public class 예제Q6_2 {
    public static void main(String[] args) {
        Point2 p = new Point2(2,3);
        System.out.println(p.toString());
        System.out.println(p); //p는 p.toString()으로 자동 변환
        System.out.println(p+ "입니다."); //p.toString() + "입니다."로 자동변환
    }
}
