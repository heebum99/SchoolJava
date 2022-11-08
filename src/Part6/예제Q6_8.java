package Part6;

public class 예제Q6_8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("this");
        
        sb.append(" is pencil"); //문자열 덧붙이기
        System.out.println(sb);

        sb.insert(7," my"); //"my" 문자열 삽입
        System.out.println(sb);

        sb.replace(8,10,"your"); //인덱스 8~9를 "your"로 대체
        System.out.println(sb);
        
        sb.delete(8,13); //인덱스 8~12의 문자를 삭제
        System.out.println(sb);
        
        sb.setLength(4); //스트링 버퍼 내 문자열 길이를 4로 수정
        System.out.println(sb);
    }
}
