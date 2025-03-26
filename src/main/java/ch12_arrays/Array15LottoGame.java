package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

/*
    1차 배열을 기준으로
    1 ~ 45까지의 임의의 숫자를 뽑아 배열에 대입

    목표는 1차 배열 내에 6개의 임의의 int값을 집어넣는 것
    근데, 중복이 있으면 안됨.

    복습을 한다고 가정하고 1 ~ 45까지의 숫자를
    여섯개짜리의 빈 배열에 집어넣는 것부터 하겠습니다.

    lottoNumbers에 1 ~ 45까지의 숫자 중 6개를 뽑아 대입하는 반복문 작성
    -> 1차 배열 하나가 완성됩니다.

    그 1차 배열이 10번 반복되게끔 반복문 작성
    -> 그럼 전체적으로 2중 for문이 됩니다.(혹시 while문으로 작성하고 싶다면
    그래도 됩니다)
 */
public class Array15LottoGame {
    public static void main(String[] args) {
        // 객체 생성
        Random random = new Random();
        // 빈 배열 선언
        int[] lottoNumbers = new int[6];
        // 게임 횟수
        int round = 5;
        int temp = 0;
        boolean duplicate;

        for (int i = 0 ; i < round ; i++ ){
            for (int j = 0 ; j < lottoNumbers.length ; j++){
                duplicate = false;
                temp = (int)((Math.random() * 45) + 1);

                for (int k = 0 ; k < j ; k++){
                    if(lottoNumbers[k] == temp){
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    lottoNumbers[j] = temp;
                } else {
                    j--;
                }
            }

            Arrays.sort(lottoNumbers);
            System.out.println(Arrays.toString(lottoNumbers));
        }
    }
}
