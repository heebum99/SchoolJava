package Part4;

class Circle2 {
    int radius;
    String name;

    Circle2() {
        radius = 1;
        name = "";
    }

    Circle2(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class 예제Q4_3 {
    public static void main(String[] args) {
        Circle2 pizza = new Circle2(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle2 donut = new Circle2(9,"희범피자");
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
