package creditcard;

public class Service extends Product {
    private String serviceType;

    public Service(String serviceType, double value) {
        super();
        super.value = value;
        this.serviceType = serviceType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
