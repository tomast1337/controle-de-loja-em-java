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
public class DaoEstoque implements DaoBasico{
    public DaoEstoque(){
        String inst = "";
        System.out.println("Persistencia.DaoEstoque.<init>()");
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
