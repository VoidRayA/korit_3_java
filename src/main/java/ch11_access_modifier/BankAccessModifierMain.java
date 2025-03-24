package ch11_access_modifier;

import java.util.Objects;
import java.util.Scanner;

public class BankAccessModifierMain {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(1234567, "유지현",
//                10000, 1234);
//
//        String result;
//        int pinNumber, amount;
//
//        bankAccessModifier1.showAccountInfo();
//        System.out.print("입금 / 출금 >>> ");
//        result = scanner.nextLine();
//
//        if(Objects.equals(result, "입금")){
//            System.out.print("비밀번호를 입력하세요 >>> ");
//            pinNumber = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("입금할 금액을 입력하세요 >>> ");
//            amount = scanner.nextInt();
//            scanner.nextLine();
//            bankAccessModifier1.deposit(amount, pinNumber);
//        } else if(Objects.equals(result, "출금")) {
//            System.out.print("비밀번호를 입력하세요 >>> ");
//            pinNumber = scanner.nextInt();
//            scanner.nextLine();
//            System.out.print("출금할 금액을 입력하세요 >>> ");
//            amount = scanner.nextInt();
//            scanner.nextLine();
//            bankAccessModifier1.withdraw(amount, pinNumber);
//        }

        BankAccessModifier bankAccessModifier1 = new BankAccessModifier(123456, "홍길동",
                100000, 1234);
        BankAccessModifier bankAccessModifier2 = new BankAccessModifier(987654, "신사임당",
                500000, 9876);

        bankAccessModifier1.deposit(50000, 1234);
        bankAccessModifier1.withdraw(200000, 1234);
        bankAccessModifier1.withdraw(100000, 1234);
        System.out.println();

        bankAccessModifier2.withdraw(400000, 9876);
        bankAccessModifier2.deposit(600000, 9876);
        System.out.println();

        bankAccessModifier1.showAccountInfo();
        System.out.println();
        bankAccessModifier2.showAccountInfo();

    }
}
