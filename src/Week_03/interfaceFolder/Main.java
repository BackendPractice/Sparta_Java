package Week_03.interfaceFolder;

// 인터페이스 정의
interface A {
    void a();
}

// 인터페이스 정의
interface B {
    void b();
}

// 인터페이스 정의
interface C extends A, B {
}

// 클래스 정의
class D {
    void d() {
        System.out.println("D");
    }
}

// 클래스 정의
public class Main extends D implements C {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    void d() {
        super.d();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();  // A
        main.b();  // B
        main.d();  // D
    }
}
