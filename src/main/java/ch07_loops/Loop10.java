package ch07_loops;

import java.util.Scanner;

/*
            *
            **
            ***
            ****
            *****
            *****
            ****
            ***
            **
            *

            *
            **
            ***
            ****
            *****
            ****
            ***
            **
            *
 */
public class Loop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int row = scanner.nextInt();
        System.out.print("몇 번 반복하시겠습니까? >>> ");
        int cnt = scanner.nextInt();

        if(row != 0){
            // # 1
            for (int i = 0 ; i < cnt ; i++){
                for (int j = 0 ; j < row + 1 ; j++){
                    for (int k = 0 ; k < j ; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int j = row ; j > 0 ; j--){
                    for (int k = 0 ; k < j ; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }

            // # 2
            for(int i = 0 ; i < cnt ; i++){
                for (int j = 0 ; j < row + 1 ; j++){
                    for (int k = 0 ; k < j ; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int j = row ; j > 0 ; j--){
                    for (int k = 0 ; k < j - 1; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}
