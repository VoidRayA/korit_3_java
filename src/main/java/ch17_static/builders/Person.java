package ch17_static.builders;

import java.util.Locale;

public class Person {
    private String name;
    private int age;
    private String address;

    // 이상의 코드들이 코드 낭비도 심하고 실제로 쓰일지에 대한 확신도 없어서
    // 빌더 패턴이 생겨났다.

    // 이제 빌더 패턴을 실제로 작성하는 부분입니다.

    private Person(Builder builder){    //argument 대입이 아니라
        // builder 객체으 ㅣ속성값을 그대로 Person 생성자에 대입하여
        // Person 객체를 생성하겠다는 의미. private이라서
        // builder를 통해서만 객체 생성이 가능
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    // 객체를 생성하는 main 단계에서 일반 생성자가 아니라
    // Builder를 통해 Person 객체를 생성할 거라서 static 선언함.
    // 그리고 public
    public static class Builder {
        private String name;
        private int age;
        private String address;

        // 이하의 코드는 일단 method에 해당
        // 대부분의 경우 동사는 행위를 나타내기 때문에 동사로 작성되지만
        // Builder 패턴의 경우 대입될 필드의 이름과 동일한
        // 메서드 명을 짓습니다.
        // 즉, Builder.name("유지현"); 와 같은 식으로 코드 작성이 되며,
        // 이 Person 객체는 name에 "유지현"라는 속성값을 갖게 됩니다.
        public Builder name(String name){
            this.name = name;
            return this;
        }
        // Builder.name("유지현").age(34);
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        // 이상의 코드까지는 필드에 속성값을 집어넣는 메서드들이었습니다.

        public Person build(){
            return new Person(this);
        }
    }
}
