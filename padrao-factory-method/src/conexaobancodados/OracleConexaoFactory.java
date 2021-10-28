package conexaobancodados;

public class OracleConexaoFactory implements IConexaoFactory {
    @Override
    public Conexao obterConexao() {
        return new ConexaoOracle();
    }
}
