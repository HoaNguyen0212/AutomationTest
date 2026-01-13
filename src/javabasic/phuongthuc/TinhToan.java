package javabasic.phuongthuc;

public class TinhToan {
    public static int cong2SoNguyen() {
        return 10 + 20;
    }

    public static void cong3SoNguyen() {
        System.out.println(10 + 20 + 30);
    }

    public static void welcome(String name) {
        System.out.println("Xin chào " + name);
    }

    public static void main(String[] args) {
        System.out.println(cong2SoNguyen() + 20);
        cong3SoNguyen();

        welcome("Hoa");
        welcome("Autotest");


    }
}
