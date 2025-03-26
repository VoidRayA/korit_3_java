package ch12_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array16LottoAnswer {

    public static void main(String[] args) {
        // 객체 생성
        Random random = new Random();
        // 빈 배열 선언
        int[] lottoNumbers = new int[6];
        // 게임 횟수
        int  round = 5;
        int  temp = 0;
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
