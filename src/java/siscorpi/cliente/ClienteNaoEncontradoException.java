/*
 * ClienteNaoEncontradoException.java
 *
 * Created on 13 de Novembro de 2005, 00:48
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package siscorpi.cliente;

/**
 *
 * @author sergio
 */
public class ClienteNaoEncontradoException extends Exception {
    private String rg;
    /** Creates a new instance of ClienteNaoEncontradoException */
    public ClienteNaoEncontradoException(String rg) {
        super ("Cliente não encontrado!");
        this.rg = rg;
    }
    public String getrg(){
        return rg;
    }
}
