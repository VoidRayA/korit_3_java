package ch00_review;
/*
    클래스 - 설계도 / 틀 /청사진
    클래스 내부에는 속성(필드 / 멤버변수 / 인스턴스변수) / 행위(메서드)
 */
public class Review07 {
    static class Developer{
        // 필드 선언
        String name;
        boolean window;
        boolean java;
        boolean python;
        int career;
        String company;

        // 생성자 정의 -> 원래 기본 생성자는 default로 있습니다.

        void introduce(){
            System.out.println("안녕하세요 제 이름은 " + this.name + "입니다.");
            System.out.println("현재 저는 " + this.company + "에서 일하고 있으며,");
            System.out.println("windwo PC 소유 : " + this.window);
            System.out.println("Java 역량 : " + this.java);
            System.out.println("python 역량 : " + this.python);
            System.out.println("인 상황입니다. 열심히 하겠습니다.");
        }
    }

    public static void main(String[] args) {
        // 기본 생성자로 객체 생성하고 싶다면 바로 가능;
        Developer developer1 = new Developer();
        /*
            전부 다 main 단계에 작성하시오.
            이름 여러분이름
            window PC 소유 여부 yes
            company 코리아아이티 아카데미
            java 능력 소유 여부 yes
            python 능력 소유 여부 no
            career에 3

            속성에 값을 대입하려면 어떡해야할까요.
            작성하고, 콘솔창에
            안녕하세요 제 이름은 여러분이름입니다.
            현재 저는 코리아아이티아카데미에서 일하고 있으며,
            windwo PC 소유 : true
            Java 역량 : true
            python 역량 : false
            인 상황입니다. 열심히 하겠습니다.
         */

        developer1.name = "유지현";
        developer1.window = true;
        developer1.company = "코리아아이티 아카데미";
        developer1.java = true;
        developer1.python = false;
        developer1.career = 3;

        developer1.introduce();

    }
}
