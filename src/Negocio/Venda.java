/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Nicolas Vycas Nery
 */
public class Venda {
    private int numero;
    private String Data;
    private ItensVenda itens;
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public ItensVenda getItens() {
        return itens;
    }

    public void setItens(ItensVenda itens) {
        this.itens = itens;
    }
    
}
