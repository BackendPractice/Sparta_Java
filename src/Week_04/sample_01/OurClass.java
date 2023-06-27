package Week_04.sample_01;

public class OurClass {
    private final boolean just = true;

    // 예외가 발생할 수 있음을 알리기
    public void thisMethodIsDangerous () throws OurBadException {
        // dangerous logic
        if (just) {
            throw new OurBadException();
        }
    }
}
