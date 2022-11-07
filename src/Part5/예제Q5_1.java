package Part5;

class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("좌표 : (" + x + "," + y + ")");
    }
}

class ColorPoint extends Point{
    private String color;

    public void setColor(String color){
        this.color=color;
    }

    public void showColorPoint(){
        System.out.print("색 : "+color+", ");
        showPoint(); //Point의 showPoint() 호출
    }
}

public class 예제Q5_1 {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
