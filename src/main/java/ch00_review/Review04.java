package ch00_review;

import java.util.Scanner;

public class Review04 {
    public static void main(String[] args) {
        /*
            for 반복문
            for(시작값 ; 한계값 ; 증감값) {
                반복실행문
            }
            시작값에는 처음 선언하는 변수여야 오류를 막을 수 있습니다.

            for(시작값 ; 한계값 ; 증감값) {
                반복실행문1
                while/if/for() {
                    반복실행문2
                }
                반복실행문3
            }
         */

//        int limitNumber = 100;
//
////        for (int i = 1; i < limitNumber ; i++){
//////            System.out.println(i + " ");
////            // 여기 내부에 if문을 써서 1부터 limitNumber까지의 숫자 중
////            // 짝수만 뽑아낼 수 있도록 하는 조건문을 작성하시오.
////
////            int addedI = i + 1;
////            if(addedI % 2 == 0){
////                System.out.print(addedI + " ");
////            }
////        }
//
//        int num = 1;
//        while (num < limitNumber){
//            if(num % 2 == 1){
//                System.out.print(num + " ");
//            }
//            num++;
//        }

        /*
             여태까지 제가 코드를 작성하는 방식을 봤을 때
             사용하는 클래스들을 import -> 엔터 두번친 다음에 사용할 변수목록
         */

        // 사용할 클래스 목록(객체 생성)
        Scanner scanner = new Scanner(System.in);

        // 사용할 변수 목록
        int numOfStudent = 0;
        double sum = 0;
        double avg = 0;

        System.out.print("학생의 수는 몇 명인가요? >>> ");
        numOfStudent = scanner.nextInt();

        for (int i = 0 ; i < numOfStudent ; i++){
            double score = 0;
            System.out.print("점수를 입력하세요. >>> ");
            score = scanner.nextDouble();
            sum += score;
        }
        System.out.println("총합 : " + sum);
        avg = sum / numOfStudent;
        System.out.println("평균 : " + avg);

        /*
            이상과 같은 코드라인이 있을 때 sum / avg는 아직 사용되지도
            않았는데 미리 선언되어있고,
            numOfStudent의 경우에는 몇 줄만 더 내려가면 쓰는데
            굳이 저 위에 꾸역꾸역 써놨습니다.

            그런데 사용할 클래스 및 변수 목록을 봤을 때(그리고 변수명을
            해석했을 때), 학생 수와 점수를 입력 받아서 합을 구하고
            평균을 내는 방식으로 이루어질 거라는 유추가 가능합니다.

            또한, Java 코딩에 익숙하시다면
            학생 개개인의 점수를 입력할 수 있도록 하는
            score1, score2의 형태가 아니라 sum만 존재한다는 점에서
            for 반복문 내부에 sum += 이 사용될거라는 것도 추론하실 수 있습니다.

            이상의 추론을 바탕으로 저희가 반복문을 작성해보자면
         */

        System.out.print("학생의 수는 몇 명인가요? >>> ");
        numOfStudent = scanner.nextInt();

        int n = 1;
        double score = 0;
        while (n <= numOfStudent){
            System.out.print("점수를 입력하세요. >>> ");
            score = scanner.nextDouble();
            sum += score;
            n++;
        }
        System.out.println("총합 : " + sum);
        avg = sum / numOfStudent;
        System.out.println("평균 : " + avg);
    }
}
