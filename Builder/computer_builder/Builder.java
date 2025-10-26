package Builder.computer_builder;

public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}