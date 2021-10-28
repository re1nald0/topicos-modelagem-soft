package conexaobancodados;

public class ConexaoMySql extends Conexao {
    @Override
    public void definirDriver() {
        this.jdbcDriver = "com.mysql.cj.jdbc.Driver";
    };

    @Override
    public void definirHostname(String hostname) {
        this.hostname = hostname;
    };

    @Override
    public void definirUrl(String url) {
        this.url = url;
    };

    @Override
    public void definirUsuario(String usuario) {
        this.usuario = usuario;
    };

    @Override
    public void definirSenha(String senha) {
        this.senha = senha;
    };

    @Override
    public void definirNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

	@Override
	public String toString() {
		return "ConexaoMySql [con=" + con + ", jdbcDriver=" + jdbcDriver + ", hostname=" + hostname + ", url=" + url
				+ ", usuario=" + usuario + ", senha=" + senha + ", nomeBanco=" + nomeBanco + "]";
	};
}
