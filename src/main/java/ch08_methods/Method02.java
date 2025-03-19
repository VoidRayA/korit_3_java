package ch08_methods;

import java.util.Scanner;

/*
    별찍기 관련한 메서드를 구현할 예정.
 */
public class Method02 {

    public static String getStar(int rows, int select){ //rows와 rowOfStars는 서로 다른 개념
        String result = "";

        if(select == 1){ // 1. 왼쪽으로 치우친 증가하는 별
            for (int i = 0 ; i < rows + 1 ; i++){
                for (int j = 0 ; j < i ; j++){
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 2) { // 2. 오른쪽으로 치우친 증가하는 별
            for (int i = 0 ; i < rows + 1 ; i++){
                for (int j = 0 ; j < rows - i ; j++) {
                    result += " ";
                }

                for (int j = 0 ; j < i ; j++){
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 3) { // 3. 왼쪽으로 치우친 감소하는 별
            for (int i = 0 ; i < rows ; i++){
                for (int j = rows ; j - i > 0 ; j--){
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 4) { // 4. 오른쪽으로 치우친 감소하는 별
            for (int i = 0 ; i < rows ; i++){
                for (int j = 0 ; j < i + 1 ; j++) {
                    result += " ";
                }

                for (int j = rows ; j - i > 0 ; j--){
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "잘못 입력하셨습니다. 프로그램을 종료합니다.";
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars = 0, choice = 0;
        String starResult = "";

        System.out.print("몇 줄 짜리 별을 생성할까요? >>> ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("메뉴를 선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice);
        System.out.println(starResult);
    }
}
