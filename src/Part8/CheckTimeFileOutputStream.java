package Part8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CheckTimeFileOutputStream {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.dat"); //test.dat 파일을 생성
            fout.write(3);
            fout.write(5);
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.dat"); //test.dat 파일을 읽어온다.
            int c;
            while((c=fin.read())!=-1){ //test.dat 파일의 내용을 화면에 출력
                System.out.print((char)c+" ");
            }
            fout.close();
            fin.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
