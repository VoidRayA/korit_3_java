package ch14_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1;  // 업캐스팅 # 1
        animal1.makeSound();    // 개가 짖습니다. 재정의됨 method() 호출
        // anima. fetch(0;      // 호출 불가. 당연하게도 animall을 Dog클래스의 객체가 아니니까

        dog1.fetch();           // dog1을 animal1에 대입했다고 해서 dag11이 사라지는건 아님

        Animal animal2 = new Dog(); // djqzotmxld # 2 -> 시험에 자주 나옴
        animal2.makeSound();        // 개가 짖습니다. 마찬가지로 재정의 된 method 호출

        Animal animal3 = new Animal();
        animal3.makeSound();        // 동물이 소리를 냅니다.

        // instanceof 연산자 사용 사례
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);        // true;
        boolean result2 = animal2 instanceof Dog;
        System.out.println(result2);

        // : object가 인스턴스이거나 '하위 클래스의 인스턴스인 경우'
        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);        // true
        boolean result4 = dog1 instanceof Animal;
        System.out.println(result4);        // true

        System.out.println("----- animal2는 animal1과 사실상 같기 때문에 그러려니하고 animal3 검증합니다.");
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);        // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);        // false

        System.out.println("↑ 업캐스팅");
        System.out.println("↓ 다운캐스팅");

        /*
            다운 캐스팅은 '명시적'으로 이루어져야합니다.
            어떻게?
            (클래스명)객체명; -> (int)2.3 과 같은 방식으로
            그래서 이제는 기본 자료형에서 벗어산서 참조형까지 고려해야함
         */

        Dog dog2 = (Dog) animal2;       // 다운캐스팅 방법
        dog2.makeSound();
        dog2.fetch();
        ;                  // animal2는 Animal 클래스에 종속돼있기 때문에
        // Dog의 고유 메서드 사용이 불가능 했고(공통 메서드는 재정의된 버전),
        // 지금은 대놓고 Dog 클래스의 객체이기 때문에 .fetch() 사용가능

        Dog dog3 = (Dog) animal3;       // 빨간줄 안뜨는에
//        dog3.makeSound();             // 오류 발생함.
        // 문제점 : 다운캐스팅은 됐는데, 하고 나서 오류가 발생한다는 점

        /*
            애초에 animal3을 생성할 때 Animal 클래스의 생성자를 호출해서 만들어기 때문에
            다운캐스팅이 불가능합니다.

            즉 이를 막기 위해서는
         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야만 합니다.

        // 그렇다면 animal3 사례에서와 같은 오류 발생을 막기 위한 다른 캘스팅은
        // instanceof 연산자를 통한 조건식을 잦성함으로써 이루어질 수 있습니다.
        System.out.println("anilmal14 검증 파트");
        if (animal4 instanceof Dog) {     // 얘가 true라면 animal4는 Dog 클래스와 관련있음
            Dog dog4 = (Dog) animal4;   // 위의 조건식이 통과되면 다운캐스팅

            dog4.makeSound();
            dog4.fetch();
        }

        System.out.println("animal3는 다운캐스팅 안되는거 알았으니까 한 번 안전한 다운캐스팅 도전");
        if(animal3 instanceof Dog){
            dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅입니다.");
        }

    }
}
