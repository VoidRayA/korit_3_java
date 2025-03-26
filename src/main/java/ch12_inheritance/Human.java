package ch12_inheritance;
/*
    Tiger.Java처럼 Animal 클래스를 상속 받고
    생성자 및 getter / setter 다 정의하시고
    Animal 클래스 move() 메서드를 오버라이딩하여
    "사람이 두 발로 걷습니다."만 출력하도록 '재정의'하시고

    Main.java에서
    human1 객체를 생성(기본생성자사용)하여 setter를 활용,
    여러분이름과 여러분나이를 입력,
    getter를 활용하여
    "안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다."
    "내년에는 몇+1살이 됩니다."를 출력하시오.

    또한 Human 클래스의 고유 메서드인 read("자바의 기초")를
    정의하여 콘솔에 다음과 같이 출력될 수 있도록 하시오.

    "여러분이름은 자바의 기초를 읽는 중입니다."

    -> read 메서드는 이상의 호출 방식을 봤을 때 call2()유형입니다.

    실행 예
    사람 객체가 생성되었습니다.
    사람이 두 발로 걷습니다.
    안녕하세요, 제 이름은 여러분이름이고 나이는 몇살입니다.
    내년에는 몇+1살이 됩니다.
    여러분이름은 자바의 기초를 읽는 중입니다.
 */
public class Human extends Animal{
    // 상속 받게 되면 Animal 클래스의 필드를 그대로 사용 가능합니다.
    // 고유 메서드처럼 고유 속성도 가질 수 있습니다.
    String smartPhone;


    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    public Human(String animalName) {
        super(animalName);
    }

    public Human(int animalAge) {
        super(animalAge);
    }

    public Human(String animalName, int animalAge, String smartPhone) {
        super(animalName, animalAge);   // 부모 필드를 그대로 대입하는 것.
        this.smartPhone = smartPhone;
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String book){
        System.out.println(getAnimalName() + "은 " + book + "를 읽는 중입니다.");
    }

    // 새로 만든 필드인 smartPhone에 관한 getter / setter는 추가적으로 작성해야할 필요가 있습니다.

    public String getSmartPhone() {
        return smartPhone;
    }

    public void setSmartPhone(String smartPhone) {
        this.smartPhone = smartPhone;
    }
}
