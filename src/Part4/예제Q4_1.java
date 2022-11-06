package Part4;

class Circle {
    int radius;
    String name;

    public Circle() {

    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class 예제Q4_1 {
    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.radius=10;
        pizza.name="자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        Circle donut = new Circle();
        donut.name="희범피자";
        donut.radius=9;
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);
    }
}
