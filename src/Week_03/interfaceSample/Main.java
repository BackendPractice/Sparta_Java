package Week_03.interfaceSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();
        a1.a();  // B.a()
        // a1.b();  // 에러 발생

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();  // B.a()
        b.b();  // B.b()
        System.out.println();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C();
        a2.a();  // B.a()
        //a2.b();  // 에러 발생
        //a2.c();  // 에러 발생

        System.out.println("\nC 강제 타입변환");
        C c = (C) a2;
        c.a();  // B.a()
        c.b();  // B.b()
        c.c();  // C.c()
    }
}

interface A {
    void a();
}
class B implements A {
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B {
    public void c() {
        System.out.println("C.c()");
    }
}
