//this example is from GFG
package Builder.computer_builder;

class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();

    public void buildCPU() {
        computer.setCPU("Gaming CPU");
    }

    public void buildRAM() {
        computer.setRAM("16GB DDR4");
    }

    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    public Computer getResult() {
        return computer;
    }
}
    

