package Part3;

public class 예제Q3_4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // 1단에서 9단
            for (int j = 2; j < 10; j++) { // 각 단의 구구셈 출력
                System.out.print(j + "*" + i + "=" + i * j); // 구구셈 출력
                System.out.print('\t'); // 하나씩 탭으로 띄기
            }
            System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
        }

    }
}
