package ch06_condition;

import java.util.Scanner;

/*
    중첩 if(Nested if condition sentence)
        if 문 내에 if문이 연속적으로 작성될 수 있습니다.

    형식 :
    if(조건식1) {
        실행문1
        if(조건식1-a){
            실행문1-a
        } else if(조건식1-b){
            실행문1-b
        } else {
            실행문1-c
        }
    } else if(조건식2) {
        실행문2
        if(조건식2-a){
            실행문2-a
        } else {
            실행문2-b
        }
    } else {
        실행문3
    }
 */
public class Condition06 {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오

            score가 0보다 작거나 100 초과라면 grade는 X
            score 90 ~ 100, grade = A
            score 80 ~ 90, grade = B
            score 70 ~ 80, grade = C
            score 60 ~ 70, grade = D
            score 50 ~ 59, grade = F

            실행 예 # 1
            점수를 입력하세요 >>> -10
            입력한 점수는 -10점이며 학점은 X입니다.

            실행 예 # 2
            점수를 입력하세요 >>> 92
            입력한 점수는 92점이며 학점은 A학점입니다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        String grade = "";

//        if(score < 0) {
//            grade = "X";
//        } else {
//            if (score > 100) {
//                grade = "X";
//            } else {
//                if(score > 90){
//                    grade = "A";
//                } else if(score > 80){
//                    grade = "B";
//                } else if(score > 70){
//                    grade = "C";
//                } else if(score > 60){
//                    grade = "D";
//                } else {
//                    grade = "F";
//                }
//            }
//        }

        if(score > 100 || score < 0){
            grade = "X";
            System.out.println("0 ~ 100 사이의 점수만 입력가능합니다.");
        } else{
            if (score >= 90){
                grade = "A";
            } else if (score >= 80){
                grade = "B";
            } else if (score >= 70){
                grade = "C";
            } else if (score >= 60){
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("입력한 점수는 " + score + "점이며 " + "학점은 " + grade + "학점입니다.");
        }
    }
}
