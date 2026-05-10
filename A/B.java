package A;

import B.Z;
import C.G;

public class B {
    private String name;
    private int age;

    private void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class C {
    public static void main(String[] args) {
        // A a = new A();
        // a.name = "hello";
        // a.age = 34;
        // a.display();
        // B b = new B();
        // b.name = "hello";
        // b.age = 34;
        // b.display();
        Z ca = new Z();
        ca.name = "hi";
        ca.age = 13;
        ca.display();

        G cb = new G();
        cb.name = "hi";
        cb.age = 13;
        cb.display();
    }
}

class X extends G {
    public static void main(String[] args) {
        G obj = new G();
        obj.name = "hi";
        obj.age = 13;
        obj.display();
        X obj1 = new X();
        obj1.name = "hi";
        obj1.age = 13;
        obj1.display();
    }
}

class P extends Z {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.name = "hi";
        obj.age = 13;
        obj.display();
        P obj2 = new P();
        obj2.name = "hi";
        obj2.age = 13;
        obj2.display();
    }
}