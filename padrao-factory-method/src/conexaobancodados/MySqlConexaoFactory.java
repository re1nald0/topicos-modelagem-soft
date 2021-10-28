package conexaobancodados;

public class MySqlConexaoFactory implements IConexaoFactory {
    @Override
    public Conexao obterConexao() {
        return new ConexaoMySql();
    }
}
