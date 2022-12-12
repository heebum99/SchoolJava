package Part8;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("c:\\Temp\\test2.txt"); //12345678이 입력된 파일
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5); //바이트 단위로 출력, 영문만 출력가능
            //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out),5); => 한글까지 출력가능
            while ((c = fin.read()) != -1) {
                out.write(c);
            } //버퍼 크기가 5이므로 크기가 5단위로 꽉찰때마다 출력하므로 12345까지만 출력
            new Scanner(System.in).nextLine();
            out.flush(); //line 17에 의해 ENTER 키를 입력받으면 flush()가 실행되면서 버퍼에 남아있던 나머지 678이 출력됨
            fin.close();
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
