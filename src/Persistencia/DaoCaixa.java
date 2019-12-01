package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Nicolas Vycas Nery
 */
public class DaoCaixa implements DaoBasico{
    public DaoCaixa(){
        String inst = "";
        System.out.println("Persistencia.DaoCaixa.<init>()");
        try {
            Connection con = DaoConexao.getInstancia().getCon();
            try (PreparedStatement pS = con.prepareStatement(inst)){
                pS.execute();
            }
            DaoConexao.getInstancia().setCon(con);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean incluir(Object o) {
        
    }

    @Override
    public boolean alterar(Object o) {
        
    }

    @Override
    public boolean excluir(Object o) {
        
    }

    @Override
    public Object buscar(int iD1, int iD2) {
        
    }

    @Override
    public List<Object> carregar() {
        
    }
    
}
