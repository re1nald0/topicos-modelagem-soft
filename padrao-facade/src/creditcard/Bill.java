package creditcard;

import java.util.ArrayList;

public class Bill {
    private ArrayList<Product> products;
    private double value = 0;
    private String dueDate;

    public Bill() {
        this.products = new ArrayList<>();
        this.products.add(new Product("Geladeira", 2000.00));
        this.products.add(new Product("Almoco restaurante", 65.00));
        this.products.add(new Service("Uber", 50.00));
        for(int i = 0; i < products.size(); i++) {
            this.value = this.value + this.products.get(i).getValue();
        }

        this.dueDate = "10/01/2022";
    }

    public boolean payBill(double value) {
        if(value >= this.value) {
            this.products.clear();
            this.value = 0;
            System.out.println("Fatura paga");
            return true;
        } else {
            System.out.println("Valor insuficiente para pagar a fatura");
            return false;
        }
    }

    public void printBill() {
        System.out.println("---FATURA---");
        for(int i = 0; i < products.size(); i++) {
            if(this.products.get(i) instanceof Service) {
                System.out.println("Servico: " + this.products.get(i).getServiceType());
                System.out.println("Valor: " + this.products.get(i).getValue());
                System.out.println();
            } else if(this.products.get(i) instanceof Product) {
                System.out.println("Produto: " + this.products.get(i).getName());
                System.out.println("Valor: " + this.products.get(i).getValue());
                System.out.println();
            }
        }
        System.out.println("Valor total: " + this.value);
        System.out.println("Data de vencimento " + this.dueDate);
        System.out.println("------------");
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }    
}
