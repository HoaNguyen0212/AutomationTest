package javabasic.phuongthuc;

public class Company {

    public static String COMPANY = "VIETTEL";
    public static String ADDRESS = "HÀ NỘI";
    public static String PHONE = "0987654321";
    public static String EMAIL = "VIETTEL@GMAIL.COM";

    public static void getInforCompany() {
        System.out.println("Company Name: " + COMPANY);
        System.out.println("Address: " + ADDRESS);
        System.out.println("Phone Number: " + PHONE);
        System.out.println("Email: " + EMAIL);
    }

    public static String getCOMPANY() {
        return COMPANY;
    }

    public static String getADDRESS() {
        return ADDRESS;
    }

    public static String getPHONE() {
        return PHONE;
    }

    public static String getEMAIL() {
        return EMAIL;
    }
}
