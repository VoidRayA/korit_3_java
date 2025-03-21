package ch00_review;

class Data {
    private int intData;
    private String strData;

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStrData() {
        return strData;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }
}

public class Review10 {
    public static void main(String[] args) {
        Data data = new Data();

        data.setIntData(1750);
        data.setStrData("집가는 시간!!!!!!!!!!");

        System.out.println("오늘 " + data.getIntData() + "은 " + data.getStrData());
    }
}
