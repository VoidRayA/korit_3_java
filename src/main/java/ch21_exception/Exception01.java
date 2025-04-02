package ch21_exception;

public class Exception01 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
