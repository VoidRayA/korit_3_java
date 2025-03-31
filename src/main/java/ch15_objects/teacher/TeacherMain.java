package ch15_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("유지현", "코리아아이티");
        Teacher teacher2 = new Teacher("유지현", "코리아아이티");

        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1); // true -> 객체 상에서의 .equals() 주소지가 아니라 속성값이 같은지 확인
        boolean result2 = teacher1 == teacher2;
        System.out.println(result2); // false -> 주소지까지 같은지를 확인

        System.out.println(teacher1);

        Class tClass = teacher1.getClass();         // Class class는 처음 배웠음.
        System.out.println(tClass);         // class ch15_objects.teacher.Teacher
        System.out.println(teacher1.getClass().getSimpleName());        // Teacher
        System.out.println(tClass.getSimpleName());                     // Teacher

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields);
        for (int i = 0 ; i < fields.length ; i++){
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지 + 클래스 명  : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());
        }

        // 이상의 fields의 element를 출력하는 반복문을 참고하여 향상된 for문으로 작성해서
        // e동일한 결과값을 출력하시오

        for (Field field : fields){
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지 + 클래스 명  : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName());
        }

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0 ; i < methods.length ; i++){
            System.out.println("메서드 명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType());
        }

        // 향상된 for문으로 연습
        for (Method method : methods){
            System.out.println("메서드 명 출력 : " + method.getName());
            System.out.println("리턴 타입 출력 : " + method.getReturnType());
        }

        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("유지현", "코리아아이티");

//        System.out.println(teacher3 instanceof Teacher);      // 오류 발생
        // teacher3의 경우 다른 경로의 Teacher클래스의 인스턴스이기 때문에 오류 발생

        // String 상에서 지난번에 굳이 new String("안녕하세요")와 "안녕하세요"가 false인걸 증명했는데
        // 어느 정신나간 사람이 굳이 new String()으로 만들겠냐

//        String[] strArray = {"안녕하세요", "안녕하세요"};
//        boolean result3 = strArray[0].equals(strArray[1]);
//        System.out.println(result3);        // true
//        boolean result4 = strArray[0] == strArray[1];
//        System.out.println(result4);        // true
//
//        String[] strArray2 = {"안녕하세요", "안녕하세요"};
//        boolean result5 = strArray[0].equals(strArray2[0]);
//        System.out.println(result5);        // true
//        boolean result6 = strArray[0] == strArray2[0];
//        System.out.println(result6);        // true
    }
}
