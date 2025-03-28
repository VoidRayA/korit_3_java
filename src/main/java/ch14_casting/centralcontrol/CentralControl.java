package ch14_casting.centralcontrol;

public class CentralControl {
    // 필드 선언
    private final Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    
    // 전자제품들을 CentralControl의 객체인 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device){
        // 왜 매개변수가 Power인가를 고려할 필요
        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
            객체명.getClass() -> 패키지 명을 포함한 클래스명이 출력되는 getter
            객체명.getClass().getSimpleName -> 클래스명만 출력되는 getter
         */
    }

    // 배열의 개수는 정해져있는데 객체가 너무 많으면 문제가 생기기 때문에
    // 메서드를 하나 정의
    private int checkEmpty() {   // 비어있는 배열의 index 넘버를 반환
        // 반복문을 사용
        // 순서대로 작동하는 반복문 특성상 웬만하면 가장 빠른 index()가 return;
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }

        return -1;
        /*
            Java의 index 넘버에는 음수값이 없기 때문에(python에서는 마이너스 인덱스 개념이 있습니다.)
            실패를 나타낼 때 -1을 쓰는 경우가 많습니다. 하지만 0과 너무 가까운 수이다보니 -100이든
            아예 return 값으로 나올 수 없을만한 음수를 지정하는 경우도 있는데,
            나중에 addDevice()메서드에 if(checkEmpty() == - 2914782)로 쓰고 싶지않으면
            -1 쓰는게 가장 보편적
         */
    }

    public void powerOn(){
        // 배열 내부에 있는 element들은(Power의 서브클래스들의 인스턴스)
        // 전부 .on()과 .off()를 공통적으로 가집니다.
        // 그러면 배열 내부를 반복문으로 돌려서 각각 .on을 실행시켜야합니다.
        for (Power device : deviceArray){
            if(device == null){
                System.out.println("장치가 없어 전원을 켜지 않았습니다.");
                continue;       // 다음 반복문으로 건너뛰는 명령어 / break / return;과 비교할 것
            }
            device.on();
        }

//        for (int i = 0 ; i < deviceArray.length ; i++){
//            deviceArray[i].on();
//        }
    }

    public void powerOff(){
        for (int i = 0 ; i < deviceArray.length ; i++){
            if(deviceArray[i] == null){
                System.out.println("장치가 없어 전원을 끄지 않았습니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    // 현재 배열 내에 각 객체들이 들어가있습니다.
    // 객체명.getClass().getSimpleName()을 활용하면 클래스 네임이 출력되는 것을 확인할 수
    // 있습니다.
    // deviceArray를 반복문 돌려서 몇 번 인덱스에 어떤 클래스의 객체가 있는지를 표시하는
    // displayInfo() 메서드를 정의하시오.

    public void displayInfo(){
        for (int i = 0 ; i < deviceArray.length ; i++){
            if(deviceArray[i] == null){
                System.out.println("슬롯 [" + (i + 1) + "] 번 : Empty");
                continue;
            }
            System.out.println("슬롯 [" + (i + 1) + "] 번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }

    // 배열 내부를 돌면서 각 elemetn의 고유 메서드를 호출하는 메서드
    public void performSpecificMethod(){
        for (Power device : deviceArray){
            if (device instanceof Tv){ //실행된다면 배열 내부의 element가 Tv 클래스로 생성되었다가 Power로 업캐스팅 되었다는 뜻
                Tv tv = (Tv)device; // 다운캐스팅은 명시적이어야하기 때문에
                tv.changeChannel();
            } else if (device instanceof LED) {
                LED led = (LED)device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse)device;
                mouse.leftClick();
            } else if (device instanceof Computer){
                Computer computer = (Computer)device;
                computer.compute();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker)device;
                speaker.changeEqualizer();
            } else if (device == null){
                System.out.println("장치가 비어있습니다.");
            } else {
                System.out.println("아직 지원하지 않는 기기입니다.");
            }
        }
    }
}
