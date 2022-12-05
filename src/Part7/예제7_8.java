package Part7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class 예제7_8 {
    static void printList(LinkedList<String> I) {
        Iterator<String> iterator = I.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext()) {
                separator = "->";
            } else {
                separator = "\n";
            }
            System.out.print(e + separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add(0, "터미네이터");
        myList.add(2, "아바타");

        Collections.sort(myList); //요소 정렬
        printList(myList); //요소 출력

        Collections.reverse(myList); //요소 순서를 반대로 정렬
        printList(myList);

        int index = Collections.binarySearch(myList, "아바타") + 1; //myList 배열에서 "아바타"의 인덱스를 찾기
        System.out.println("아바타는 "+index+"번째 요소입니다.");
    }
}
