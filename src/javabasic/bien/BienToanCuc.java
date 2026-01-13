package javabasic.bien;

import javax.xml.namespace.QName;

public class BienToanCuc {
    //biến toaàn cục
    String name = "Hoa";
    int age = 24;
    String address = "Thanh Hóa";

    public void getInfo1() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void getInfo2() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        BienToanCuc b = new BienToanCuc();
        System.out.println("Name: " + b.name);
        System.out.println("Age: " + b.age);
        System.out.println("Address: " + b.address);
    }
}
