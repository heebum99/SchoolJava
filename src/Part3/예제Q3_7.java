package Part3;

import java.util.Scanner;

public class 예제Q3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[5]; // 배열 생성
        int min = 100; // 현재 가장 작은 수 0~100사이기 때문에 최솟값 100으로 초기화.
        int index = 0;
        System.out.println("양수 5개를 입력하세요.");

        for (int i = 0; i < 5; i++) {
            intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열에 저장

            if (intArray[i] < 0 || intArray[i] > 100) {
                i--;
                continue;
            }

            if (intArray[i] < min) { // intArray[i]가 현재 가장 작은수보다 작으면
                min = intArray[i]; // intArray[i]를 min로 변경
                index = i + 1;
            }
        }

        System.out.print("가장 작은 수는 " + index + "번째 수인 " + min + "입니다.");
        scanner.close();
    }
}
