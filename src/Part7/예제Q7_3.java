package Part7;

import java.util.ArrayList;
import java.util.Scanner;

public class 예제Q7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요 >> ");
            String s = scanner.nextLine();
            a.add(s);
        }

        for (int i = 0; i < a.size(); i++) {
            String name = a.get(i);
            System.out.print(name + " ");
        }

        int longestIndex = 0, shortestIndex = 0;

        for (int i = 1; i < a.size(); i++) {
            if (a.get(longestIndex).length() < a.get(i).length()) {
                longestIndex = i;
            }
            if (a.get(shortestIndex).length() > a.get(i).length()) {
                shortestIndex = i;
            }
        }

        System.out.println("\n가장 긴 이름은 : "+(longestIndex+1)+"번째 입력된 "+a.get(longestIndex));
        System.out.println("가장 짧은 이름은 : "+(shortestIndex+1)+"번째 입력된 "+a.get(shortestIndex));
    }
}
