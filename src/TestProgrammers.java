public class TestProgrammers {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        programmer1.name = "Gigi";
        programmer1.age = 22;
        programmer1.wearsGlasses = false;

        programmer1.drinkCoffee();
        programmer1.printDetails();


        Programmer programmer2 = new Programmer();
        programmer2.name = "Jonh";
        programmer2.age = 25;
        programmer2.wearsGlasses = true;

        programmer2.drinkCoffee();
        programmer2.hasGlasses();



    }
}
