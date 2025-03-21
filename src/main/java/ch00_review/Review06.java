package ch00_review;

import java.util.Scanner;

public class Review06 {
    // method 정의 영역
/*
    1. 총합을 내는 메서드 구현
        1) 매개변수는 score1, score2
        2) return 타입은 double
        호출 방식
        System.out.println(review06.addScores(4.5, 3.0));
        실행 예
        7.5
    2. 평균을 내는 메서드 구현
        1) 매개변수는 totalScore, numOfSubs
        2) return 타입은 double
        호출 방식
        System.out.println(review06.calculateAvg(totalScore, numOfSubs));
 */
    public double addScores(double score1, double score2){
        double sum = 0;
        sum = score1 + score2;
        return sum;
    }

    public double calculateAvg(double totalScore, double numOfSubs){
        double avg = 0;
        avg = totalScore/numOfSubs;
        return avg;
    }

    public static void main(String[] args) {
        Review06 review06 = new Review06();
        Scanner scanner = new Scanner(System.in);
//        // method 호출 영역
////        System.out.println(review06.addScores(4.5, 3.0));
//
//        System.out.print("합계점수를 입력해주세요 >>> ");
//        double totalScore = scanner.nextDouble();
//        System.out.print("과목수를 입력해주세요 >>> ");
//        double numOfSubs = scanner.nextDouble();
//
//        System.out.printf("%.2f%n",review06.calculateAvg(totalScore, numOfSubs));

        /*
            여태까지 메서드 정의한 것의 문제점은 두 과목의 점수를 더한 값만
            반환한다는 의미였습니다.

            이를 main단계에서 반복문과 결합하여
            원하는 과목의 개수의 점수 합을 구할 수 있도록 작성할 예정
            그리고 기거에 맞춰서 평균 점수도 출력할 수 있도록 작성
         */
        double score1 = 0, score2 = 0, totalScore = 0, averageScore;
        int subjects = 0;
        // for문으로 반복문을 작성한다고 가정할 경우에 한계값이 사전에 지정
        // 되어야함으로 과목수를 먼저 물어보는 출력문을 작성

        System.out.print("몇 과목 입력하시겠습니까? >>> ");
        subjects = scanner.nextInt();

        // 한계값 설정이 완료 되었으므로 for 반복문 작성
        for (int i = 0 ; i < subjects ; i++) {
            // 반복 횟수가 지정되었으니 점수를 물어보는 출력문 작성
            System.out.print((i+1) + "번째 과목의 점수를 입력하세요 >>> ");
            totalScore += scanner.nextDouble();
        }

        averageScore = review06.calculateAvg(totalScore, subjects);
        System.out.println("당신의 평균 학점은 " + String.format("%.2f", averageScore) + "점입니다.");
    }
}
