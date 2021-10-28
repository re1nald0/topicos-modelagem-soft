package conexaobancodados;

public class run {
    public static void main(String[] args) {
        MySqlConexaoFactory fabricaMySql = new MySqlConexaoFactory();
        Conexao mySqlConection = fabricaMySql.obterConexao();

        mySqlConection.definirDriver();
        mySqlConection.definirHostname("127.0.0.1");
        mySqlConection.definirUrl("127.0.0.1:3306");
        mySqlConection.definirUsuario("user-mysql");
        mySqlConection.definirSenha("12345");
        mySqlConection.definirNomeBanco("aeroporto");

        OracleConexaoFactory fabricaOracle = new OracleConexaoFactory();
        Conexao oracleConection = fabricaOracle.obterConexao();

        oracleConection.definirDriver();
        oracleConection.definirHostname("127.0.0.1");
        oracleConection.definirUrl("127.0.0.1:1521");
        oracleConection.definirUsuario("user-oracle");
        oracleConection.definirSenha("67890");
        oracleConection.definirNomeBanco("aeroporto");

        System.out.println("Conexao MySql");
        System.out.println(mySqlConection);

        System.out.println("------------");

        System.out.println("Conexao Oracle");
        System.out.println(oracleConection);
    }
}
