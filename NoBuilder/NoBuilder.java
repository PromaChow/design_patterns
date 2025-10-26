
class Computer {
    private String cpu;
    private String ram;
    private String storage;


    public Computer(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }


    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void displayInfo() {
        System.out.println("Computer Configuration:\n" +
                "CPU: " + cpu + "\n" +
                "RAM: " + ram + "\n" +
                "Storage: " + storage + "\n");
    }
}

public class Main {
    public static void main(String[] args) {

        Computer gamingComputer = new Computer(
                "Gaming CPU",     
                "16GB DDR4",      
                "1TB SSD"        
        );


        gamingComputer.displayInfo();

        Computer officeComputer = new Computer("", "", "");
        officeComputer.setCPU("Intel i5");
        officeComputer.setRAM("8GB DDR4");
        officeComputer.setStorage("512GB SSD");

        officeComputer.displayInfo();
    }
}
