package ch07_loops;

import java.util.Scanner;

/*
        *
       **
      ***
     ****
    *****

    공백의 갯수를 책임 지는 반복문 -> 개행시마다 공백으 개수가 줄어드니까
    별의 개수가 줄어드는 반복문을 참조

    별의 갯수를 책임지는 반복문 -> 개행시마다 별의 개수가 늘어나니까
    맨 처음에 배웠던 반복문을 참조
 */
public class Loop09 {
    public static void main(String[] args) {
//        // # 1
//        for (int i = 0 ; i < 6 ; i++){
//            for (int j = 5 ; j > i ; j--) {
//                System.out.print(" ");
//            }
//
//            for (int k = 0 ; k < i ; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // # 2
//        for (int i = 0 ; i < 6 ; i++){
//            for (int j = 0 ; j < 6 - i ; j++) {
//                System.out.print(" ");
//            }
//
//            for (int k = 0 ; k < i ; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 생성하시겠습니까? >>> ");
        int row = scanner.nextInt() + 1;

        for (int i = 0 ; i < row ; i++){
            String text = "";
            String empty = " ";
            String star = "";
            for (int j = row ; j > row - i + 1 ; j--){
                empty += empty;
            }

            for (int k = 0 ; k < i; k++){
                star += "*";
            }
            System.out.println(empty + star);
        }
    }
}
