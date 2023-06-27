package Week_04.sample_01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        try {
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException error) {
            System.out.println(error.getMessage());  // 위험한 행동을 하면 예외처리를 해야함
        } finally {
            System.out.println("try가 실행되든, catch가 실행되든 나는 무조건 실행됨");  // try가 실행되든, catch가 실행되든 나는 무조건 실행됨
        }
    }
}
