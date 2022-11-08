package Part6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 예제Q6_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.print("날짜를 입력하시오(YYYY/MM/DD 형태) >> ");
        st = new StringTokenizer(scanner.nextLine(),"/");
        System.out.println(st.nextToken()+"년 "+st.nextToken()+"월 "+st.nextToken()+"일");
    }
}
