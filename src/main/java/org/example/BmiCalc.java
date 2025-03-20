package org.example;

import java.util.Scanner;

/*
    이하의 코드에 필요한 로직을 작성하고,
    BmiCalcMain에 적용하여 -> 여기에 객체도 생성해야하고,
                         -> getBmi라는 메서드도 호출
    동일한 결과값이 나오도록 작성하시오.

    이 클래스에 getBmiResult 메서드를 call3()으로 정의하여
    bmiCalc.getBmiResult(); 를 호출 했을 때
    실행 예
    키(cm)를 입력하세요 >>> 172
    몸무게(kg)를 입력하세요 >>> 70
    당신의 BMI 지수는 23.6659310이며 과체중입니다.

    가 출력되도록 하시오.
 */
public class BmiCalc {
    public double getBmi(double height, double weight){
        double bmi = 0;

        height = (height * 0.01);
        bmi = weight / (height*height);

        return bmi;
    }

    public String getResult(double bmi){
        String result = "";

        if(bmi < 18.5){
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상체중";
        } else if (bmi < 25) {
            result = "과체중";
        } else{
            result = "비만";
        }

        return result;
    }

    public void getBmiResult(){
        Scanner scanner = new Scanner(System.in);
        double height = 0, weight = 0, bmi = 0;
        String result = "";

        System.out.print("키(cm)를 입력하세요. >>> ");
        height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요. >>> ");
        weight = scanner.nextDouble();

        bmi = getBmi(height, weight);
        result = getResult(bmi);

        System.out.println("당신의 BMI는 지수는 " + String.format("%.2f", bmi) + "이며, " + result + "입니다.");
    }
}
