package Part4;

import java.util.Scanner;

class Calc {
//    public static int abs(int a) { //절대값
//        return (a > 0 ? a : -a);
//    }

    public static int max(int a, int b) { //최대값
        return ((a > b) ? a : b);
    }

    public static int min(int a, int b) { //최소값
        return ((a > b) ? b : a);
    }

    public static int diff(int a, int b) { //뺄셈
        return ((a > b) ? (a - b) : (b - a));
    }
}

public class 예제Q4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Diff, 2.Max, 3.Min 중 선택하세요 >> ");
        int select = scanner.nextInt();
        System.out.print("두 개의 정수를 입력해주세요 >> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Diff는 "+Calc.diff(num1,num2)+" 입니다.");
                break;
            case 2:
                System.out.println("Max는 "+Calc.max(num1,num2)+" 입니다.");
                break;
            case 3:
                System.out.println("Min은 "+Calc.min(num1,num2)+" 입니다.");
                break;
            default:
                System.out.println("번호를 다시 입력하세요");
                System.exit(0);
        }

//        System.out.println(Calc.abs(-5));
//        System.out.println(Calc.max(10, 8));
//        System.out.println(Calc.min(-3, -8));
    }
}
