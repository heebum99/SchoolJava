package Part2;

import java.util.Scanner;

public class 예제Q2_4 {
    public static void main(String[] args) {
        System.out.println("2018314009 김희범");
        System.out.println("이름, 학번, 학년, 평점을 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름은 "+name);

        String student_Id = scanner.next();
        System.out.println("학번은 "+student_Id);

        byte grade = scanner.nextByte();
        if(grade >=1 && grade<=4){
            System.out.println("학년은 "+grade+"학년");
        }
        else{
            System.out.println("학년을 잘못입력했습니다.");
            System.exit(0);
        }

        double score = scanner.nextDouble();
        if(score>=0 && score<=4.5){
            System.out.println("평점은 "+score+"입니다.");
        }
        else{
            System.out.println("평점을 잘못입력했습니다.");
            System.exit(0);
        }

    }
}
