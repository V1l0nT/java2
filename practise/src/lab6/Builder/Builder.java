package src.lab6.Builder;

// Интерфейс Строителя
public interface Builder {
    void buildPart1();
    void buildPart2();
    void buildPart3();
    Product getResult();
}
