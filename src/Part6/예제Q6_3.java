package Part6;

class Point3 {
    int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) { //객체 안의 필드 값이 서로 같은지 확인하는 메소드
        Point3 p = (Point3) obj; //obj변수를 (Point)타입으로 형변환(캐스팅)
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}

public class 예제Q6_3 {
    public static void main(String[] args) {
        Point3 a = new Point3(2, 3);
        Point3 b = new Point3(2, 3);
        Point3 c = new Point3(3, 4);

        if (a == b) { //false => 값은 서로 같지만 다른 객체를 가리키고 있는 레퍼런스기 때문
            System.out.println("a==b");
        }
        if (a.equals(b)) { //true => 필드 값이 서로 같기 때문에
            System.out.println("a is equal to b");
        }
        if (a.equals(c)) { //false => 필드 값이 서로 다르기 때문
            System.out.println("a is equal to c");
        }
    }
}
