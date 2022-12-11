package Part8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHanulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null; //바이트 스트림을 전달받아 문자 정보로 변환하는 스트림 객체
        FileInputStream fin = null; //바이트 파일 입력 스트림
        try{
            fin = new FileInputStream("c:\\Temp\\hangul.txt");
            in = new InputStreamReader(fin,"UTF-8");
            int c;

            System.out.println("인코딩 문자 집합은 "+in.getEncoding()); //문자집합 이름 리턴
            while((c=in.read())!=-1){
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        } catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
