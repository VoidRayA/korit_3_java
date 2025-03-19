package ch09_classes;

import java.util.Scanner;

public class ScoreCalcMain {
    public static void main(String[] args) {
        // 필요한 class들을 import
        Scanner scanner = new Scanner(System.in);

        ScoreCalc scoreCalc = new ScoreCalc();

        double sum = scoreCalc.addScores(100, 100);
        System.out.println(sum);

        // ch08의 ScoreCalc2와 동일한 기능을 하도록
        // 나머지 코드를 전부 작성하시오

        // 사용할 변수 목록
        boolean endOfCalc = false;
        double score1 = 0;
        double totalScore = 0;
        int totalSubjects = 1;
        double avgScore = 0;

        // 점수 입력을 횟수와 상관없이 받기 위한 반복문 작성
        while (!endOfCalc){
            System.out.print("점수를 입력하세요(종료하려면 -1을 입력하세요) >>> ");
            score1 = scanner.nextDouble();
            if(score1 == -1){
                break;
            }
            // 합을 계산하는 코드
            totalScore = scoreCalc.addScores(totalScore, score1);

            // 평균을 계산하는 코드
            avgScore = scoreCalc.calculateAvg(totalScore, totalSubjects);
            System.out.println("------ 점수 입력시마다 나오는 합계와 평균입니다. ------");
            System.out.println("입력한 점수의 합계 : " + totalScore);
            System.out.println("입력한 점수의 평균 : " + avgScore);

            totalSubjects++;    // 다음 반복시에는 한 과목 더 늘어난 상태로 평균 계선의 분모가 되어야하기 때문
        }

        System.out.println("====== 점수 입력 종료후  나오는 합계와 평균입니다. ======");
        System.out.println("입력한 점수의 합계 : " + totalScore);
        System.out.println("입력한 점수의 평균 : " + avgScore);
    }
}
