package Part8;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];
        try {
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
            int n = 0, c;
            while ((c = fin.read()) != -1) { //파일을 읽어 배열 b에 저장
                b[n] = (byte) c;
                n++;
            }
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for (int i = 0; i < b.length; i++) { //바이너리 코드 값을 화면에 출력한다.
                System.out.print(b[i]+" ");
            }
            System.out.println();
            fin.close();
        }catch (IOException e){
            System.out.println("c:\\Temp\\test.out에서 읽지 못했습니다. 경로명을 체크해보세요.");
        }
    }
}
