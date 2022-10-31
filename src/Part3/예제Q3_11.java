package Part3;

//비 정방형 배열을 만들고 값을 초기화 하는 것으로 변경하시오

public class 예제Q3_11 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][];
        intArray[0] = new int[1];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[4];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (i + 1) * 10 + j+1;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
