package Week_03.Polymorphism_3;

public class Tire {
    String company; // 타이어 회사

    public Tire(String company) {
        this.company = company;
    }

    public void rideComfort() {
        System.out.println(company + " 타이어 승차감은?");
    }
}
