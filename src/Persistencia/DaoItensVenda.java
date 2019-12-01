package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nicolas Vycas Nery
 */
public class DaoItensVenda implements DaoBasico{
    public DaoItensVenda(){
        String inst = "CREATE TABLE IF NOT EXISTS ItensVenda (" +
                      "  Venda_Numero INT NOT NULL," +
                      "  Produto_Codigo INT NOT NULL," +
                      "  Quantidade INT NULL," +
                      "  PRIMARY KEY (Venda_Numero, Produto_Codigo)," +
                      "  INDEX fk_Venda_has_Produto_Produto1_idx (Produto_Codigo ASC)," +
                      "  INDEX fk_Venda_has_Produto_Venda1_idx (Venda_Numero ASC)," +
                      "  CONSTRAINT fk_Venda_has_Produto_Venda1" +
                      "    FOREIGN KEY (Venda_Numero)" +
                      "    REFERENCES mydb.Venda (Numero)" +
                      "    ON DELETE NO ACTION" +
                      "    ON UPDATE NO ACTION," +
                      "  CONSTRAINT fk_Venda_has_Produto_Produto1" +
                      "    FOREIGN KEY (Produto_Codigo)" +
                      "    REFERENCES mydb.Produto (Codigo)" +
                      "    ON DELETE NO ACTION" +
                      "    ON UPDATE NO ACTION);";
        System.out.println("Persistencia.DaoItensVenda.<init>()");
        try {
            Connection con = DaoConexao.getInstancia().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)){
                pS.execute();
            }
            DaoConexao.getInstancia().setCon(con);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage())
        }
    }
    @Override
    public boolean incluir(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar(int iD1, int iD2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> carregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
