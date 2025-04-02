package ch19_collections;

import java.util.HashMap;
import java.util.Map;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        userMap.put("username", "1");
        userMap.put("password", "1234");
        userMap.put("email", "c@test.com");
        userMap.put("name", "김일");
    }
}
