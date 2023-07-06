package Week_05.Test;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();
        a1.a();  // B.a()
        // a1.b();  // 에러 발생

        // B로 강제 타입 변환
        B b = (B) a1;
        b.a();  // B.a()
        b.b();  // B.b()
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C();
        a2.a();  // B.a()
        //a2.b();  // 에러 발생
        //a2.c();  // 에러 발생

        // C로 강제 타입 변환
        C c = (C) a2;
        c.a();  // B.a()
        c.b();  // B.b()
        c.c();  // C.c()
    }
}