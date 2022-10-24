package Part3;

public class 예제Q3_9 {
    enum Week {월, 화, 수, 목, 금, 토, 일}

    public static void main(String[] args) {
        double[] n = {1.1, 2.2, 3.3, 4.4, 5.5};
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        double sum = 0;
        // 아래 for-each에서 k는 n[0], n[1], ..., n[4]로 반복
        for (double k : n) {
            System.out.print(k + " "); // 반복되는 k 값 출력
            sum += k;
        }
        System.out.println("합은 " + sum);
        // 아래 for-each에서 s는 names[0], names[1], ..., names[5]로 반복
        for (String s : names)
            System.out.print(s + " ");
        System.out.println();
        // 아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복
        for (Week day : Week.values())
            System.out.print(day + "요일 ");
        System.out.println();

    }
}
