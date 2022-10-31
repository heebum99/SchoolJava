package Part3;

//2차원 배열에 학년별로 1,2학기 성적으로 저장하고, 4년간 전체 평점 평균을 출력하라.
//각 학년의 평점을 출력한 후 4년 전체 평균을 출력하도록 수정하시오

public class 예제Q3_10 {
    public static void main(String[] args) {
        double score[][] = {{3.3, 3.4}, //1학년 평점
                {3.5, 3.6}, //2학년 평점
                {3.7, 4.0}, //3학년 평점
                {4.1, 4.2}}; //4학년 평점

        double total_sum = 0; //4년 평점 합

        for (int year = 0; year < score.length; year++) { //전체 4년 평점의 합 구하기
            System.out.print((year+1)+"학년 평점:");
            for (int term = 0; term < score[year].length; term++) {
                System.out.print(score[year][term]+" ");
                total_sum += score[year][term];
            }
            System.out.println();
        }
        System.out.println();

        double total_avg = total_sum / (score.length * score[0].length); //4년 전체 평점 평균

        System.out.println("4년 전체 평점 평균은 " + total_avg);
    }
}
