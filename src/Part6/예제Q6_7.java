package Part6;

public class 예제Q6_7 {
    public static void main(String[] args) {
        String a = new String(" C#");
        String b = new String(",C++ ");

        System.out.println(a + "의 길이는 " + a.length()); //문자열 길이(개수)출력
        System.out.println(a.contains("#")); //문자열을 포함하고 있는지 여부

        a = a.concat(b); //문자열 a와 b를 연결
        System.out.println(a);

        a = a.trim(); //문자열 앞 뒤 공백 제거
        System.out.println(a);

        a = a.replace("C#", "Java"); //문자열 "C#"을 "Java"로 대체
        System.out.println(a);

        String s[] = a.split(","); //문자열 ","을 기준으로 분리

        for (int i = 0; i < s.length; i++) {
            System.out.println("분리된 문자열"+i+":"+s[i]);
        }
        
        a= a.substring(5); //인덱스 5부터 끝까지 서브 스트링으로 리턴
        System.out.println(a);
        
        char c= a.charAt(2); //인덱스 2번 문자 리턴
        System.out.println(c);
    }
}
