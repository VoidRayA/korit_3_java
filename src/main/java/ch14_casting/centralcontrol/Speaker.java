package ch14_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 끕니다.");
    }

    public void changeEqualizer(){
        System.out.println("스피커의 주파수를 변경합니다.");
    }
}
