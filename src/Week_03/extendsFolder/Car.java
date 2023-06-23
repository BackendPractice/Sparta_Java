package Week_03.extendsFolder;

// 부모 클래스
public class Car {

    String company; // 자동차 회사
    private String model; // 자동차 모델
    char gear = 'P'; // 기어의 상태, P,R,N,D

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public void horn() {
        System.out.println("빵빵");
    }

}
