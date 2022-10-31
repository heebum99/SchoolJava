package Part3;

//출력을 먼저 하도록 수정하여 intArray[4] 값까지 출력되도록 하시오

public class 예제Q3_16 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 0;
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
                intArray[i + 1] = i + 1 + intArray[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}
