package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "유지현";
        String strExample2 = new String("유지현");

        boolean result1 = strExample1 == strExample2;
        System.out.println(result1);    // false
        boolean result2 = strExample1.equals(strExample2);
        System.out.println(result2);    // true

        ObjectTest objectTest1 = new ObjectTest("유지현", "부산광역시 연제구");
        objectTest1.displayInfo1();

        ObjectTest objectTest2 = new ObjectTest();
        objectTest2.setName("지현유");
        objectTest2.setAddress("부산광역시 동래구");

        System.out.println(objectTest2.displayInfo2());

        System.out.println(objectTest2);
    }
}
