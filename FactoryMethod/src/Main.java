import computer.ComputerFactory;
import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory idCardFactory = new IDCardFactory();

        Product card1 = idCardFactory.create("A");
        Product card2 = idCardFactory.create("B");
        Product card3 = idCardFactory.create("C");

        card1.use();
        card2.use();
        card3.use();

        Factory computerFactory = new ComputerFactory();

        Product com1 = computerFactory.create("S");
        Product com2 = computerFactory.create("L");
        Product com3 = computerFactory.create("H");

        com1.use();
        com2.use();
        com3.use();
    }
}
