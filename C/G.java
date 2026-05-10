package C;

public class G {
    protected String name;
    protected int age;

    protected void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class H {
    public static void main(String[] args) {
        G ca = new G();
        ca.name = "hello";
        ca.age = 34;
        ca.display();

    }
}