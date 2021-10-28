package userpermissions;

public class runUser {
    public static void main(String[] args) {
        User regularUser1, regularUser2, administrativeUser1, administrativeUser2;

        System.out.println("Criando usuarioRegular 1 via construtor");
        regularUser1 = new RegularUser();

        regularUser1.setNome("Usuario regular 1");
        regularUser1.setCargo("Advogado");
        regularUser1.setIdentificador("12345");
        regularUser1.setCategoriaPermissao("Apenas visualizacao");
        regularUser1.setCanCreate(false);
        regularUser1.setCanView(true);
        regularUser1.setCanUpdate(false);
        regularUser1.setCanDelete(false);

        System.out.println("Exibindo regularUser 1");
        System.out.println(regularUser1.toString());
        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Criando regularUser 2 via clone do usuarioRegular 1");

        regularUser2 = regularUser1.clone();
        regularUser2.setNome("Usuario regular 2");
        regularUser2.setCargo("Analista RH");
        regularUser2.setIdentificador("67890");

        System.out.println("Exibindo regularUser 2");
        System.out.println(regularUser2.toString());
        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Criando administrativeUser 1 via construtor");
        administrativeUser1 = new AdministrativeUser();

        administrativeUser1.setNome("Usuario administrativo 2");
        administrativeUser1.setCargo("Analista TI");
        administrativeUser1.setIdentificador("00000");
        administrativeUser1.setCategoriaPermissao("Todas as permissoes");
        administrativeUser1.setCanCreate(true);
        administrativeUser1.setCanView(true);
        administrativeUser1.setCanUpdate(true);
        administrativeUser1.setCanDelete(true);

        System.out.println("Exibindo administrativeUser 1");
        System.out.println(administrativeUser1.toString());
        System.out.println();
        System.out.println("------------------------------");

        System.out.println("Criando administrativeUser 2 via clone do administrativeUser 1");

        administrativeUser2 = administrativeUser1.clone();
        administrativeUser2.setNome("Usuario administrativo 2");
        administrativeUser2.setCargo("Analista Redes");
        administrativeUser2.setIdentificador("11111");

        System.out.println("Exibindo administrativeUser 2");
        System.out.println(administrativeUser2.toString());
        System.out.println();
        System.out.println("------------------------------");
    }
}
