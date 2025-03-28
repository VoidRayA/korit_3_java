package ch14_casting.animals;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("개가 짖습니다.");
    }

    // Dog 자체의 고유 메서드
    public void fetch(){
        System.out.println("강아지가 공을 물어옵니다");
    }
}
