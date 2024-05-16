package src.lab6.Builder;

// Конкретная реализация Строителя
public class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.setPart1("Часть 1");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Часть 2");
    }

    @Override
    public void buildPart3() {
        product.setPart3("Часть 3");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
