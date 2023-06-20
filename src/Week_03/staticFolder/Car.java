package Week_03.staticFolder;

public class Car {
    // 클래스 멤버 (필드)
    static String company = "GENESIS";

    public Car() {} // 기본 생성자


    // 클래스 멤버 (메서드)
    static String setCompany(String companyName) {
        company = companyName;
        return company;
    }
}
