package javabasic.bien;

public class BienCucBo {

    public void sayHello() {
        int n = 10; //Đay là biến cục bộ (local)
        System.out.println("Gia tri củas n là: " + n);
    }

    public static void main(String[] args) {
        String name = "Hoa"; //Biến cục bộ

        BienCucBo b = new BienCucBo();
        b.sayHello();
    }
}
