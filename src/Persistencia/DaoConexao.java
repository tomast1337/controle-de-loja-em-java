package Persistencia;

/**
 * @author Nicolas Vycas Nery
 */
import Util.Diversos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConexao {

    private static DaoConexao instancia = null;
    private Connection con;
    private String servidor;
    private String bD;
    private String usuario;
    private String senha;

    private DaoConexao() {
        this.con = null;
        this.servidor = "localhost";
        this.bD = "DBControleLoja";
        this.usuario = "root";
        this.senha = "";
        final String Driver = "com.mysql.jdbc.Driver";
        String url;
        url = "jdbc:mysql://" + servidor + '/' + bD;
        url += "?createDatabaseIfNotExist=true";
        url += "&user=" + usuario + "&password=" + senha;
        try {
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            Diversos.mostrarDados("Erro de conexão " + e.getMessage(), "Publicação", false);
        }
    }

    public synchronized static DaoConexao getInstancia() {
        if (instancia == null) {
            instancia = new DaoConexao();
        }
        return instancia;
    }

    //Executar sem permitir que o processo seja interrompido   
    public static void setInstancia(DaoConexao instancia) {
        DaoConexao.instancia = instancia;
    }

    public Connection getCon() {
        if (con == null) {
            getInstancia();
        }

        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
