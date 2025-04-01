package ch18_generic.wildcard;

public class Main {

    // AnimalData의 필드가 Animal 클래스의 서브 클래스에 대핟ㅇ하는지
    // 확인하는 메서드
    public AnimalData<? extends Animal> getAnimal(int flag){
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<>(new Human());
        } else if (flag == 2){
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }


    public static void main(String[] args) {
        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());
        // 현재 AnimalData에 Car 객체가 들어가있지만 오류가 발생하지 않습니다.
        // T에는 어떤 클래스든 들어갈 수 있기 때문에.

        animalData1.printData();
        animalData2.printData();
        animalData3.printData();
        // animalData3의 printData()에만 문제가 생깁니다.
        // 이상의 오류는 결국 AnimalData 클래스의 printData() 메서드를 확인해서
        // Car 객체를 강제로 Animal 형태로 형변환시키려고 했기 때문에
        // 오류가 발생했음을 확인할 수 있습니다.
        // 그러니까 문제점은 피르뎅 대입은 잘 일어나는데,
        // 메서드 실행시키려고 하다보니까 에러가 난다는 점입니다.
        // 이까지가 그냥 제네릭 적용했을 때 생길 수 있는 문제점입니다.
        // 이제 밑으로 와일드 카드 적용 파트입니다.

        // Main 클래스의 객체 생성
        Main main = new Main();
        AnimalData<? extends  Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends  Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends  Animal> animalData6 = main.getAnimal(3);

        // 이상의 코드의 결과 animalData4,5,6에는 뭔지 모를 클래스의 객체가
        // 필드로 들어가있습니다.
        // 그래서 오류를 발생시키지 않고 실행시키기 위해
        // 조건문을 작성해보겠습니다.

        if (animalData4 != null){
            animalData4.printData();
        }
        if (animalData5 != null){
            animalData5.printData();
        }
        if (animalData6 != null){
            animalData6.printData();
        }else {
            System.out.println("내부 필드에 null값입니다.");
        }

    }
}
