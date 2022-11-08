package Part7;

import java.util.Scanner;
import java.util.Vector;

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class 예제Q7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Point> v = new Vector<>();

        v.add(new Point(scanner.nextInt(), scanner.nextInt()));
        v.add(new Point(scanner.nextInt(), scanner.nextInt()));
        v.add(new Point(scanner.nextInt(), scanner.nextInt()));

        for (int i = 0; i < v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p);
        }

        v.remove(v.size()-1);
        for (int i = 0; i < v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p);
        }
    }
}
