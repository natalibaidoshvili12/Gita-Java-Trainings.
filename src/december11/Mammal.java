package december11;

public class Mammal extends Animal {

    public void eat() {
        System.out.println("Mammal " + name + " is eating");
    }

    @Override
    public void getName() {
        System.out.println("Mammal " + name);
    }
}
