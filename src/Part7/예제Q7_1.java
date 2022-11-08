package Part7;

import java.util.Scanner;
import java.util.Vector;

public class 예제Q7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<Integer>(3);

        v.add(scanner.nextInt());
        v.add(scanner.nextInt());
        v.add(scanner.nextInt());
        v.add(2,scanner.nextInt());

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        //모든 요소 정수 출력
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.println(n);
        }

        //벡터의 정수 요소 모두 더하기
        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.elementAt(i); //v.get(i)랑 같다.
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
