package B;

public class D {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class E {
    public static void main(String[] args) {
        Z ca = new Z();
        ca.name = "hello";
        ca.age = 34;
        ca.display();

    }
}
