package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };

//        System.out.println(arr1[1]);

        // 배열의 element 출력 방법
//        int[] arr2 = {9,8,7,6,5};
//        System.out.println(arr2[0]);

//        for (int i = 0 ; i < arr2.length ; i++ ){
//            System.out.print(arr2[i] + " ");
//        }
//
//        // 예를 들어 ages 라는 배열을 선언했다고 가정했을 때, 다음 해가 되면
//        // +1씩 시켜줘야되는데, 원래는 하나하나 재대입해가지고 집어넣어야되겠지만
//        // 배열에 저장해뒀다면 element들만 반복문으로 뽑아낸 뒤에 더해줄 수 있습니다.
//
//        for (int i = 0 ; i < arr2.length ; i++ ){
//            System.out.print(arr2[i] + " ");
//        }

        // arr2 = {9,8,7,6,5}가 있는데
        // arr2 = {18,16,14,12,10}로 바꿔서 (*2하셔야합니다 재대입하지마시고)
        // 반복문을 통해 각 element를 출력하시오.

//        for (int i = 0 ; i < arr2.length ; i++ ){
//            arr2[i] *= 2;
//            System.out.print(arr2[i] + " ");
//        }

        // String 배열 선언 및 초기화
        String[] strArr1 = {"안", "녕", "하", "세", "요"};

        // element들 하나하나 출력하는데 실행결과 안녕하세요 로 콘솔에 출력
        // 출력결과 안/녕/하/세/요 로 출력되게 할 것

        for (int i = 0 ; i < strArr1.length ; i++){
            System.out.print(strArr1[i] + "/");
        }
    }
}
