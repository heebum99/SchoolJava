package Part7;

import java.util.Scanner;

class GStack2<T> {
    int tos;
    Object[] stck;

    GStack2() {
        tos = 0;
        stck = new Object[5];
    }

    public boolean isFull() { //push 하기 전 스택이 full인지 검사하는 용도
        if (tos == 5) {
            System.out.println("스택이 꽉 찼습니다.");
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() { //pull 하기 전 스택이 empty인지 검사하는 용도
        if (tos == 0) {
            System.out.println("스택이 비어있습니다.");
            return true;
        } else {
            return false;
        }
    }

    public void push(T item) {
        stck[tos++] = item;
    }

    public T pop() {
        tos--;
        return (T) stck[tos];
    }
}

public class 예제Q7_10 {
    //T가 매개 변수, 리턴 타입이 T인 제네릭 메소드
    public static <T> GStack2<T> reverse(GStack2<T> a) {
        GStack2<T> s = new GStack2<>();
        while (true) {
            T tmp;
            if (a.isEmpty()) {
                break;
            }
            tmp = a.pop();
            if (tmp == null) {
                break;
            } else {
                s.push(tmp);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        GStack2<Double> gs = new GStack2<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            if (gs.isFull()) {
                break;
            }
            double d = scanner.nextDouble();
            gs.push(Double.valueOf(d));
        }

        gs = reverse(gs);
        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }
    }
}
