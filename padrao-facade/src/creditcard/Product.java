package creditcard;

public class Product {
    private String name;
    protected double value;

    public Product() {
    }

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getServiceType() {
        return null;
    };

    public void setServiceType() {
    };
}
