package Part2;

import java.util.Scanner;

public class OpenChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String cheol = scanner.next();
        System.out.print("영희 >> ");
        String young = scanner.next();

        if(cheol.equals(young)){ //무승부인 경우
            System.out.println("무승부입니다.");
        } else if ((cheol.equals("가위")&&young.equals("보"))
                ||(cheol.equals("바위")&&young.equals("가위"))
                ||(cheol.equals("보")&&young.equals("바위"))) { //철수가 이기는 경우
            System.out.println("철수가 이겼습니다.");
        }else { //영희가 이기는경우
            System.out.println("영희가 이겼습니다.");
        }

        scanner.close();
    }
}
