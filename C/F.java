package C;


public class F {
    protected String name;
    protected int age;

    protected void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        F ca = new F();
        ca.name = "hello";
        ca.age = 34;
        ca.display();

    }
}
