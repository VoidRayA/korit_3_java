package ch06_condition;

import java.util.Scanner;

/*
    switch문

    형식 :
    switch(변수명)
        case 조건1:
            실행문1
            break;
        case 조건2:
            실행문2
            break;
        case 조건3:
            실행문3
            break;
        case 조건4:
            실행문4
            break;
        defalut:
            실행문5
            break;
 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String selected = null;
        String menu = "";

        System.out.println(" [ 선택 프로그램 ] ");
//        System.out.println("a. 메뉴1");
//        System.out.println("b. 메뉴2");
//        System.out.println("c. 메뉴3");
//        System.out.println("d. 메뉴4");
//        System.out.println("e. 메뉴5");
        System.out.println("1. 메뉴1");
        System.out.println("2. 메뉴2");
        System.out.println("3. 메뉴3");
        System.out.println("4. 메뉴4");
        System.out.println("5. 메뉴5");

        System.out.print("메뉴를 선택하세요 >>> ");
//        selected = scanner.nextLine();
        int selected2 = scanner.nextInt();

        switch (selected2){
            case 1:
                menu = "메뉴1을";
                break;
            case 2:
                menu = "메뉴2를";
                break;
            case 3:
                menu = "메뉴3을";
                break;
            case 4:
                menu = "메뉴4를";
                break;
            case 5:
                menu = "메뉴5를";
                break;
            default:
                menu = "잘못";
        }

//        switch (selected){
//            case "a":
//                menu = "메뉴1을";
//                break;
//            case "b":
//                menu = "메뉴2를";
//                break;
//            case "c":
//                menu = "메뉴3을";
//                break;
//            case "d":
//                menu = "메뉴4를";
//                break;
//            case "e":
//                menu = "메뉴5를";
//                break;
//            default:
//                menu = "잘못";
//        }

        System.out.println(menu + " 선택하셨습니다.");
    }
}
