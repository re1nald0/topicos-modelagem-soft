package conexaobancodados;

import java.sql.*;

public abstract class Conexao {
    protected Connection con = null;
    protected String jdbcDriver = null;
    protected String hostname = null;
    protected String url = null;
    protected String usuario = null;
    protected String senha = null;
    protected String nomeBanco = null;

    public abstract void definirDriver();
    public abstract void definirHostname(String hostname);
    public abstract void definirUrl(String url);
    public abstract void definirUsuario(String usuario);
    public abstract void definirSenha(String senha);
    public abstract void definirNomeBanco(String nomeBanco);

}
