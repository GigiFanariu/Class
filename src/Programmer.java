public class Programmer {

    String name;
    int age;
    boolean wearsGlasses;

    public Programmer(String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }
    public void drinkCoffee() {
        System.out.println("Espresso is the secret !");
    }
    public void printDetails() {
        System.out.println( name + age + wearsGlasses);
    }
    public void hasGlasses() {
        System.out.println(name + "wearing glasses?" + wearsGlasses);
    }
    }

