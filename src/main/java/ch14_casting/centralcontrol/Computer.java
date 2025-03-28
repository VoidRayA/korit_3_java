package ch14_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }

    // 이제 업캐스팅돼서 배열 내부에 있는 각 객체들을 다시
    // 다운캐스팅한 후에 고유 메서드들을 호출시키는 작업을 함
    public void compute() {
        System.out.println("컴퓨터가 연산을 수행합니다.");
    }
}

//LED 클래스를 생성하고 Power를 상속받아서 동일하게 작성하시오.
//Mouse 클래스를 생성하고 Power를 상속받아서 동일하게 작성하시오.
