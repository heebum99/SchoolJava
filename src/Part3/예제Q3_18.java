package Part3;
//정수가 아닌 경우에는 정수로 변환할 수 없다고 출력하고 프로그램은 계속 진행하여 배열의 마지막에 있는 998까지 출력 되도록 수정하시오
public class 예제Q3_18 {
    public static void main(String[] args) {
        String[] stringNumber = {"23", "12", "3.141592", "998"};
        int i = 0;
        try {
            for (i = 0; i < stringNumber.length; i++) {
                int j = Integer.parseInt(stringNumber[i]);
                System.out.println("숫자로 변환된 값은 " + j);
            }
        } catch (NumberFormatException e) {
            System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
        } finally {
            for (int k = i+1; k < stringNumber.length; k++) {
                int j = Integer.parseInt(stringNumber[k]);
                System.out.println("숫자로 변환된 값은 " + j);
            }
        }

    }
}
