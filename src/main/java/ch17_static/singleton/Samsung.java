package ch17_static.singleton;

import lombok.Getter;

@Getter
public class Samsung {
    // 정적 변수
    private static Samsung instance;
    // 멤버 변수
    private String company;
    private int serialNumnber;

    private Samsung() {
        company = getClass().getSimpleName();
        serialNumnber = 20250000;
    };

    public static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumnber;
    }
}
