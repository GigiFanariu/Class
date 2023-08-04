public class TestProgrammers {
    public static void main(String[] args) {

        Programmer pro1 = new Programmer("Gigi", 22, false);
        Programmer pro2 = new Programmer("Luca", 28, true);
        //Programmer 1!!
        pro1.drinkCoffee();
        pro1.printDetails();
        // Programmer 2!!
        pro2.printDetails();
        pro2.hasGlasses();
    }
}
