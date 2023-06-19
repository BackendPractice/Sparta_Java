package Week_02;

import java.util.Objects;
import java.util.Scanner;

public class Video_08 {
    public static void main(String[] args) {
        // 가위바위보 프로그램
        Scanner sc = new Scanner(System.in);

        // A 입력
        System.out.println("A를 입력해주세요");
        String aHand = sc.nextLine();

        // B 입력
        System.out.println("B를 입력해주세요");
        String bHand = sc.nextLine();

        // Objects.equals(A, B) : 두 값을 비교하는 메소드
        if (Objects.equals(aHand, "바위")) {
            if(Objects.equals(bHand, "바위")) {
                System.out.println("A와 B는 비겼습니다.");
            } else if (Objects.equals(bHand, "가위")) {
                System.out.println("A가 B를 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("B가 A를 이겼습니다.");
            } else {
                System.out.println("B가 가위바위보를 하지 않았습니다.");
            }
        } else if (Objects.equals(aHand, "가위")) {
            if(Objects.equals(bHand, "바위")) {
                System.out.println("B가 A를 이겼습니다.");
            } else if (Objects.equals(bHand, "가위")) {
                System.out.println("A와 B는 비겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A가 B를 이겼습니다.");
            } else {
                System.out.println("B가 가위바위보를 하지 않았습니다.");
            }
        } else if (Objects.equals(aHand, "보")) {
            if(Objects.equals(bHand, "바위")) {
                System.out.println("A가 B를 이겼습니다.");
            } else if (Objects.equals(bHand, "가위")) {
                System.out.println("B가 A를 이겼습니다.");
            } else if (Objects.equals(bHand, "보")) {
                System.out.println("A와 B는 비겼습니다.");
            } else {
                System.out.println("B가 가위바위보를 하지 않았습니다.");
            }
        } else {
            System.out.println("A가 가위바위보를 하지 않았습니다.");
        }
    }
}
