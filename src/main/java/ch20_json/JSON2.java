package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        // 사용할 변수 선언 -> Json 데이터는 자료형이 String입니다.
        String userJSon = null;
        String studentJSon = null;
        String productJson = null;

        // Java Object -> json으로의 변환 사례
        // user1 객체를 생성하고 "kim1", "9876", "a@test.com", "김일", "20"로 입력하시오.
        User user1 = new User("kim1", "9876", "a@test.com", "김일", "20");

        // JSON1을 참조하여 gson을 통한 JSON 데이터로 변경을 시도하세요. -> 콘솔출력
        String json = gson.toJson(user1);
        System.out.println(user1);

        // 동일하게 gsonBuilder를 통해 JSON 데이터로 변경을 시도하세요. -> 콘솔출력
        System.out.println(gsonBuilder.toJson(user1));

        // gsonBuilder를 통한 결과값을 userJson에 대입하세요.
        userJSon = gsonBuilder.toJson(user1);

        // JsonObject -> json으로 변환 사례
        // JsonObject를 활용하여 studentCode 2025001 / studentName 김이 / studentYear 2 / score 96.7인 객체를 생성하시오
        // key value 다 String으로
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "2025001");
        jsonObject.addProperty("studentName", "김이");
        jsonObject.addProperty("studentYear", "2");
        jsonObject.addProperty("score", "96.7");

        studentJSon = gsonBuilder.toJson(jsonObject);

        System.out.println(studentJSon);

        // Map -> json으로의 활용 사례
        Map<String, String> strMap = new HashMap<>();

        strMap.put("productCode", "NT960XHA-KD72G");
        strMap.put("productName", "삼성 갤럭북 프로 5");

        productJson = gsonBuilder.toJson(strMap);

        System.out.println(productJson);

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);

        // json -> user
        User user2 = gson.fromJson(userJSon, User.class);
        System.out.println(user2);

        // json -> jsonObject
        JsonObject jsonObject2 = gson.fromJson(studentJSon, JsonObject.class);
        System.out.println(jsonObject2);
    }
}
