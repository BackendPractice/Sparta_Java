package Week_03.PolySample;

public class Main {
    public static void main(String[] args) {

        // LG TV 구현체를 조작
        // 자동 형 변환
        MultiRemoteController mrc = new LgTv("LG");
        mrc.turnOnOff();  // LG Tv 전원이 켜졌습니다.
        mrc.volumeUp();  // 현재 볼륨은 1
        mrc.channelDown();  // 현재 채널은 0
        mrc.channelUp();  // 현재 채널은 1
        mrc.turnOnOff();  // LG Tv 전원이 종료되었습니다.

        // 조작 대상을 Samsung TV로 교체
        System.out.println("\n<Samsung TV로 교체>");
        mrc = new SamsungTv("Samsung");
        mrc.turnOnOff();  // Samsung Tv 전원이 켜졌습니다.
        mrc.channelUp();  // 현재 채널은 2
        mrc.volumeDown();  // 현재 볼륨은 0
        mrc.volumeUp();  // 현재 볼륨은 1
        mrc.turnOnOff();  // Samsung Tv 전원이 종료되었습니다.

        // 매개변수, 반환타입 다형성 체크
        System.out.println("\n<매개변수, 반환타입 다형성 체크>");

        MultiRemoteController samsung = mrc.getTV(new SamsungTv("Samsung"));
        samsung.turnOnOff();  // Samsung Tv 전원이 켜졌습니다.

        SamsungTv samsungTv = (SamsungTv) samsung;
        samsungTv.turnOnOff();  // Samsung Tv 전원이 종료되었습니다.

        System.out.println();
        MultiRemoteController lg = mrc.getTV(new LgTv("LG"));
        lg.turnOnOff();  // LG Tv 전원이 켜졌습니다.

        LgTv lgTv = (LgTv) lg;
        lgTv.turnOnOff();  // LG Tv 전원이 종료되었습니다.

    }
}
