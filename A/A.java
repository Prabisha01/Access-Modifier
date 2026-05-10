package A;

public class A {
    private String name;
    private int age;

    private void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        A a = new A();
        a.name = "hello";
        a.age = 34;
        a.display();

    }

}
