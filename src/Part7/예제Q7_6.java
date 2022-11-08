package Part7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 예제Q7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> javaScore = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String name = scanner.next();

            if (javaScore.containsKey(name)) {
                System.out.println("동일한 이름이 존재합니다. 다시 입력해주세요.");
                i--;
                continue;
            } else {
                int score = scanner.nextInt();
                javaScore.put(name, score);
            }
        }
        System.out.println("HashMap의 요소 개수 :" + javaScore.size());

        Set<String> keys = javaScore.keySet(); //key 문자열을 가진 집합 set 컬렉션 리턴
        Iterator<String> it = keys.iterator(); //key 문자열을 순서대로 접근할 수 있는 Iterator 리턴

        while (it.hasNext()) {
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
