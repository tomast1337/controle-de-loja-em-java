package Persistencia;

import java.util.List;

/**
 * @author Nicolas Vycas Nery
 */
public interface DaoBasico {
    public boolean incluir(Object o);
    public boolean alterar(Object o);
    public boolean excluir(Object o);
    public Object buscar(int iD1,int iD2);
    public List<Object> carregar();
}
