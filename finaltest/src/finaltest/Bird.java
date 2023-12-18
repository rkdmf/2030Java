package finaltest;

public class Bird implements Animal, Flying {
    public void makeSound() {
        System.out.println("짹짹");
    }

    public void fly() {
        System.out.println("훨훨");
    }
}
