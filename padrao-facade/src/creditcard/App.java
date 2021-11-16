package creditcard;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int option;
        boolean isLogged = false;
        Scanner input = new Scanner(System.in);
        FacadeCreditCard facadeCreditCard = new FacadeCreditCard();

        System.out.println("App Banco x - Visualizar Fatura");

        do {
            System.out.println("---REALIZE SEU LOGIN---");
            isLogged = facadeCreditCard.login();
        } while(isLogged == false);

        do {
            System.out.println("Selecione o que deseja realizar");
            System.out.println("1 - Visualizar fatura");
            System.out.println("2 - Pagar fatura");
            System.out.println("0 - Sair");
    
            option = input.nextInt();
            input.nextLine();

            switch(option) {
                case 1:
                    facadeCreditCard.visualizarFatura();
                    break;
                case 2:
                    facadeCreditCard.pagarFatura();
                    break;
                case 0:
                    isLogged = facadeCreditCard.logout();
                    System.out.println("Fechando aplicativo.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while(option != 0);

        input.close();
    }
}
