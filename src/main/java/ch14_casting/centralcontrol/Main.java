package ch14_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        // 각 클래스의 객체를 생성하겠습니다
        Computer computer1 = new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();
        Tv tv1 = new Tv();
        Speaker speaker = new Speaker();
        SmartPhone smartPhone = new SmartPhone();

        CentralControl centralControl = new CentralControl(new Power[6]);

        centralControl.addDevice(computer1);    // 업캐스팅이 암시적으로 일어남
        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);

        centralControl.powerOn();
        centralControl.powerOff();

        // Tv class / Speaker class 를 추가하여 Power를 implement 받으시고, 메서드
        // override 한 뒤
        // Main에서 배열에 집어넣고,
        // powerOn() / powerOff()

        centralControl.addDevice(tv1);
        centralControl.addDevice(speaker);
        centralControl.addDevice(smartPhone);

        centralControl.powerOn();
        centralControl.powerOff();

        centralControl.displayInfo();
        centralControl.performSpecificMethod();
    }
}
