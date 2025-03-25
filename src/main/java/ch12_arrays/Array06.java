package ch12_arrays;

public class Array06 {
    // 총합을 구하는 메서드
    private int calcSum(int[] scores){
        int sum = 0;
        for (int i = 0 ; i < scores.length ; i++){
            sum += scores[i];
        }
        return sum;
    }

    // 평균을 구하는 메서드
    private double calcAvg(int[] scores){
        return (double) calcSum(scores) / scores.length;
    }

    // 등급 인원수를 구하는 메서드
    private void countGrade(int[] scores){
        // 배열 사용하지 않는 방식
//        int cntA = 0, cntB = 0, cntC = 0, cntD = 0, cntF = 0;
//
//        for (int i = 0 ; i < scores.length ; i++){
//            if(scores[i] >= 90){
//                cntA++;
//            } else if(scores[i] >= 80){
//                cntB++;
//            } else if(scores[i] >= 70){
//                cntC++;
//            } else if(scores[i] >= 60){
//                cntD++;
//            } else {
//                cntF++;
//            }
//        }
        
        // 배열 사용 방식
        int[] gardes = { 0, 0, 0, 0, 0 };

        for (int i = 0 ; i < scores.length ; i++){
            if(scores[i] >= 90){
                gardes[0]++;
            } else if(scores[i] >= 80){
                gardes[1]++;
            } else if(scores[i] >= 70){
                gardes[2]++;
            } else if(scores[i] >= 60){
                gardes[3]++;
            } else {
                gardes[4]++;
            }
        }

        System.out.println("A학생 수 : " + gardes[0]);
        System.out.println("B학생 수 : " + gardes[1]);
        System.out.println("C학생 수 : " + gardes[2]);
        System.out.println("D학생 수 : " + gardes[3]);
        System.out.println("F학생 수 : " + gardes[4]);
    }

    //
    public void printTotalInfo(int[] scores){
        System.out.println("총합 : " + calcSum(scores));                          // 합 구하는 메서드 호출
        System.out.println("평균 : " + String.format("%.2f", calcAvg(scores)));   // 평균을 구하는 메서드 호출
        countGrade(scores);                                                      // A인원수 ... F인원수를 구하는 메서드 호출
    }

    public static void main(String[] args) {
        Array06 array06 = new Array06();
        int[] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89 };
        array06.printTotalInfo(scores);
    }
}
