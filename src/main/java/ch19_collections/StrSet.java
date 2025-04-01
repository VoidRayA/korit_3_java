package ch19_collections;

import java.util.*;

/*
    List는 순서가 있고, 중복을 허용하는 반면,
    Set의 경우 순서는 없고 중복은 허용하지 않기 때문에
    List -> Set / 혹은 Set -> List로의 형변환이 중요합니다.
    List를 통해 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군을 남기는 등의 형태로 많이 사용됩니다.
    또한 Set으로 중복을 제거한 후 .get(인덱스넘버)로 조회도 가능.
 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();
        // List 객체 생성
        List<String> strList = new ArrayList<>();

        // Set에 element 삽입 -> .add()
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");


        System.out.println(strSet);
        // 특정 element의 추출 -> List로의 형변환
        strList.addAll(strSet);
        // List로 바꿨으니까 요소 추출 가능
        // 일반 for
        for (int i = 0 ; i < strList.size() ; i++){
            System.out.println(strList.get(i));
        }
        // 정렬
        Collections.sort(strList);
        // 다시 요소 추출

        // 향상된 for문
        for(String elem : strList){
            System.out.println(elem);
        }
        // 다시 strSet으로 옮기기
        strSet.addAll(strList);

        System.out.println(strSet);
    }
}
