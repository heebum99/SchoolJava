package Part6;

class Rect {
    int width;
    int height;

    Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        //변수 obj를 (Rect)타입으로 형변환 후 Rect객체 레퍼런스 p가 같은 것을 가리키게함
        Rect p = (Rect) obj;
//        if (width * height == p.width * p.height) {
//            return true;
//        } else {
//            return false;
//        }
        if (width == p.width && height == p.height) {
            return true;
        } else {
            return false;
        }
    }
}

public class 예제Q6_4 {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);

        if (a.equals(b)) {
            System.out.println("a is equal to b");
        } else if (a.equals(c)) {
            System.out.println("a is equal to c");
        } else if (b.equals(c)) {
            System.out.println("b is equal to c");
        } else{
            System.out.println("동일한 사각형이 없습니다.");
        }

    }
}
