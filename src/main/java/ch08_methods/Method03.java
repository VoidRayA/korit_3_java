package ch08_methods;

import java.util.Scanner;

/*
    Method02.java 파일에서 별찍기 관련 method를 구현하고, 실행까지 시켜봤습니다.
    근데 getStar() 메서드를 보면 내부에 if - else if - else 형태의 구문으로
    매개변수를 1 - 4까지 받아서 출력하게끔 구현돼있습니다.

    근데 if문을 작성하면 가독성이 떨이지기 때문에
    이걸 째로 switch문으로 교체하여 동일한 기능을 하게끔
    Refactoring(리팩토링) 과정을 거치고자 합니다.
 */
public class Method03 {

    public static String getStar(int rows, int select){ //rows와 rowOfStars는 서로 다른 개념
        String result = "";

        switch (select){
            case 1: // 1. 왼쪽으로 치우친 증가하는 별
                for (int i = 0 ; i < rows + 1 ; i++){
                    for (int j = 0 ; j < i ; j++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 2: // 2. 오른쪽으로 치우친 증가하는 별
                for (int i = 0 ; i < rows + 1 ; i++){
                    for (int j = 0 ; j < rows - i ; j++) {
                        result += " ";
                    }

                    for (int j = 0 ; j < i ; j++){
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 3: // 3. 왼쪽으로 치우친 감소하는 별
                for (int i = 0 ; i < rows ; i++){
                    for (int j = rows ; j - i > 0 ; j--){
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            case 4: // 4. 오른쪽으로 치우친 감소하는 별
                for (int i = 0 ; i < rows ; i++){
                    for (int j = 0 ; j < i + 1 ; j++) {
                        result += " ";
                    }

                    for (int j = rows ; j - i > 0 ; j--){
                        result += "*";
                    }
                    result += "\n";
                }
                break;

            default:
                result = "잘못 입력하셨습니다. 프로그램을 종료합니다.";
                break;
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
