package Part3;

public class 중첩반복문 {
    public static void main(String[] args) {
        //중첩 for문을 이용한 *출력
        System.out.println("중첩for 반복문");
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("while문");

        //while문을 이용한 *출력
        int i=0, j=0;
        while(j<5) {

            if (i < 5) {
                i++;
                System.out.print("*");
            }
            else {
                j++;
                i=j;
                System.out.println();
            }
        }

        System.out.println("do~while문");
        
        //do~while문을 이용한 *출력
        i=0;
        j=0;
        do {
            if(i<5){
                i++;
                System.out.print("*");
            }
            else{
                j++;
                i=j;
                System.out.println();
            }
        }while(j<5);
    }
}
