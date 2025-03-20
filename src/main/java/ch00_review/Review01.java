package ch00_review;

import java.util.Scanner;

public class Review01 {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        // 변수 : 데이터를 담는 바구니인데, 이름표를 붙여줘요.
        // 변수의 선언 방식
        // 자료형 변수명 = 데이터;
        // 자료형 : int, double, String, boolean
        // 변수명 짓는 규칙 : 카멜케이스
        // 카멜케이스 예시 myExample과 같은 방식으로 작성
        double height = 170;
        System.out.println(height);

        // 이름, 나이, 생년월일을 적절한 자료형과 변수명으로
        // 선언 및 초기화 한 다음
        // sout을 통해 다음과 같이 출력하시오.
        /*
            실행 예
            제 이름은 어쩌고이고, 나이는 __살입니다.
            생일은 20250320입니다.
            10년 후에 저는 (__+10)살이 됩니다. 정말 싫네요.
         */
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0, birthday = 0;

        System.out.print("이름을 입력하세요 >>> ");
        name = scanner.nextLine();
        System.out.print("나이를 입력하세요 >>> ");
        age = scanner.nextInt();
        System.out.print("생일을 입력하세요 >>> ");
        birthday = scanner.nextInt();

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        System.out.println("생일은 " + birthday + "입니다.");
        System.out.println("10년 후에 저는 " + (age + 10) + "살이 됩니다. 정말 싫네요.");
    }
}
