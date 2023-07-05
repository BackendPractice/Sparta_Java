package Week_05.Test;

class Whale extends Mammal {
    public void swimming() {
        System.out.println("수영하다.");
    }

    @Override
    public void feeding() {
        System.out.println("고래는 모유수유를 합니다.");
    }
}
