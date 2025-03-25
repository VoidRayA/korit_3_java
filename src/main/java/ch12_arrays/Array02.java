package ch12_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // 비어있는 배열 선언 방식
//        int[] arr01 = new int[100];

//        // 1부터 100까지의 element를 집어넣는 코드
//        for(int i = 0 ; i < arr01.length ; i++) {
//            arr01[i] = (i+1);                       //여기서 값 대입
////            System.out.print(arr01[i] + " ");       //여기서 출력
//            // 3의 배수만 뽑아내는 조건문을 작성하시오
//            if(arr01[i] % 3 == 0){
//                System.out.print(arr01[i] + " ");
//            }
//        }

        /*
            String[] names 배열을 선언하고
            출석부에 이름을 입력하여 names 배열에 값을 집어넣는
            프로그램을 작성할 예정입니다.

            실행 예
            몇 명의 학생을 등록하시겠습니까? >>> 15
            1 번 학생 이름 : 강수림
            2 번 학생 이름 : 기준성
            3 번 학생 이름 : 김미진
            4 번 학생 이름 : 김준식
            5 번 학생 이름 : 문성진
            6 번 학생 이름 : 심민호
            7 번 학생 이름 : 양지은
            8 번 학생 이름 : 유지현
            9 번 학생 이름 : 윤현지
            10 번 학생 이름 : 이동규
            11 번 학생 이름 : 이예성
            12 번 학생 이름 : 이정화
            13 번 학생 이름 : 전용남
            14 번 학생 이름 : 채수원
            15 번 학생 이름 : 한영진

            5의 배수에 해당하는 학생만 콘솔에 출력하시오.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int index = scanner.nextInt();
        scanner.nextLine();

        String[] student = new String[index];

        if(index > 0){
            for (int i = 0 ; i < student.length ; i++ ){
                System.out.print((i + 1)  + " 번 학생 이름 : ");
                student[i] = scanner.nextLine();
            }

            for (int i = 0 ; i <student.length ; i++){
                if((i+1) % 5 == 0){
                    System.out.print(student[i] + " ");
                }
            }
        }
    }
}
