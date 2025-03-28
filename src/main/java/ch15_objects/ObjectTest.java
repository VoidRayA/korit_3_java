package ch15_objects;

import javax.swing.plaf.PanelUI;

public class ObjectTest {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ObjectTest() {
    }

    public void displayInfo1(){
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    public String displayInfo2(){
        return "이름 : " + name + "\n" + "주소 : " + address;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "\n" + "주소 : " + address;
    }
}
