package ch06_condition;

import java.util.Scanner;
/*
    과제 :

    윤년 계산기 작성

    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤년을 판단하는 규칙은
    1. 년도가 4로 나누어 떨어지는 해는 윤년에 해당할 수도 있음
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 400으로 나누어 떨어지는 해는 윤년임.

    예를 들어
    2020년은 4로 나누어 떨어지므로 윤년입니다.(100으로는 나누어떨어지지 않습니다.)
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다.
    2000년은 100으로 나누어 떨어지기는 하는데 400으로 나누어 떨여서 윤년입니다.
 */
public class Condition05 {
    public static void main(String[] args) {
        // 1. Scanner class import
        Scanner scanner = new Scanner(System.in);
        String print = "";

        System.out.print("년도를 입력하세요 >>> ");
        int year = scanner.nextInt();
//        if(year % 400 == 0){
//            leapYear = "윤년입니다.";
//        } else if (year % 100 == 0 ) {
//            leapYear = "윤년이 아닙니다.";
//        } else if (year % 4 == 0){
//            leapYear = "윤년입니다.";
//        } else {
//            leapYear = "윤년이 아닙니다.";
//        }

        boolean bool = true;
        String leapYear = "";

        if(year % 400 == 0 || year % 4 == 0){
            bool = true;
        } else if (year % 100 == 0 ) {
            bool = false;
        } else {
            bool = false;
        }

        if(bool == true){
            leapYear = "윤년입니다.";
        }
        else{
            leapYear = "윤년이 아닙니다.";
        }

        System.out.println(year + "년은 " + leapYear);
    }
}
