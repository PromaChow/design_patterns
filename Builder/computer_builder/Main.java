//this example is from GFG
package Builder.computer_builder;

public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector();

        director.construct(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getResult();

        gamingComputer.displayInfo();
    }
}
