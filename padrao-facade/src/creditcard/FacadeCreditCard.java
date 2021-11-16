package creditcard;

import java.util.Scanner;

public class FacadeCreditCard {
    private User user;
    private Bill bill;
    Scanner input = new Scanner(System.in);

    public FacadeCreditCard() {
        this.user = new User();
        this.bill = new Bill();
    }

    public boolean login() {
        System.out.println("Digite o nome de seu usuario");
        String username = input.nextLine();
            
        System.out.println("Digite sua senha");
        int password = input.nextInt();
        input.nextLine();

        if(this.user.login(username, password) == true) {
            System.out.println("Login efetuado");
            return true;
        } else {
            System.out.println("Usuario ou senha incorretos");
            return false;
        }
    }

    public boolean logout() {
        return this.user.logout();
    }

    public void visualizarFatura() {
        this.bill.printBill();
    }

    public void pagarFatura() {
        System.out.println("---ENTRE COM O VALOR QUE IRA PAGAR---");
        double value = input.nextDouble();
        this.bill.payBill(value);
    }
}
