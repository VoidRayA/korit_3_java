package ch12_arrays;

import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array06 array06 = new Array06();

        System.out.print("총학생 수를 입력하세요 >>> ");
        int[] scores = new int[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0 ; i < scores.length ; i++){
            System.out.print((i + 1) + "번째 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextInt();
        }

        array06.printTotalInfo(scores);
    }
}
