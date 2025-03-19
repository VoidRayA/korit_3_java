package ch07_loops;

import java.util.Scanner;

/*

 */
public class Loop05 {
    public static void main(String[] args) {
//        // 1일차 1교시입니다 ~ 5일차 3교시입니다.
//        for (int i = 1 ; i < 6 ; i++){
//            for (int j = 1; j < 4 ; j++){
//                System.out.println(i + "일차" + j + "교시입니다.");
//            }
//        }

//        // 이상의 코드를 응용하여 구구단 출력하시오.
//        for (int i = 2 ; i < 10 ; i++){
//            for (int j = 1 ; j < 10 ; j++){
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        }

        /*
            1 2 3 4 5 6 7 8 9 10
            ...
            91 92 93 94 95 96 97 98 99 100
         */

//        int cnt = 1;
//
//        for (int i = 1 ; i < 101 ; i++){
//            if(cnt == 11){
//                System.out.println();
//                cnt = 1;
//            }
//            System.out.print(i + " ");
//            cnt++;
//        }
//
//        for (int i = 1 ; i < 101 ; i+=10){
//            System.out.println(i + " " + (i+1) + " "+ (i+2) + " "+ (i+3) + " "+ (i+4) + " "+ (i+5)
//                    + " "+ (i+6) + " "+ (i+7) + " "+ (i+8) + " "+ (i+9) + " ");
//        }

        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>> ");
        int num1 = scanner.nextInt();

        for (int i = 0 ; i < num1 ; i++){
            for (int j = 1 ; j < 11 ; j++){
                if(j < 10){             // 1 ~ 9까지 앞의 숫자를 끼워맞추기
                    if(i == 0){         // 한자리일 때
                        text += j + " ";
                    } else {            // 한자리가 아닐 때
                        text += String.valueOf(i) + j + " ";
                    }
                } else if (j == 10){    // 10번째일 경우 앞자리만 증가하고 다음 라인
                    text += String.valueOf(i+1) + 0 + "\n";
                }
            }
        }

        System.out.print(text);
    }
}
