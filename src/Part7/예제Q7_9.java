package Part7;

import java.util.Scanner;

class GStack<T> {
    int tos;
    Object[] stck;

    GStack() {
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

public class 예제Q7_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GStack<String> stringStack = new GStack<>();

        while (true) {
            if (stringStack.isFull()) {
                break;
            }
            String item = scanner.next();
            if (item.equals("exit")) {
                break;
            } else {
                stringStack.push(item);
            }
        }

        int i = stringStack.tos;
        while (i > 0) {
            if (stringStack.isEmpty()) {
                break;
            }
            System.out.println(stringStack.pop());
        }

//        GStack<Integer> intStack = new GStack<>();
//        intStack.push(1);
//        intStack.push(3);
//        intStack.push(5);
//
//        for (int i = 0; i < intStack.tos; i++) {
//            System.out.println(intStack.pop());
//        }
    }
}
