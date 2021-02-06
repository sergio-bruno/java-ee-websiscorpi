/*
 * CadastroCliente.java
 *
 * Created on 13 de Novembro de 2005, 00:44
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package siscorpi.cliente;
import java.sql.ResultSet;
import siscorpi.util.RepositorioException;
/**
 *
 * @author sergio
 */
public class CadastroCliente {
    private RepositorioCliente clientes;
    
    public CadastroCliente(RepositorioCliente repositorio) {
        this.clientes = repositorio;
    }
    public void cadastrar(Cliente cliente) throws 
    ClienteNaoEncontradoException, RepositorioException {
        if (cliente != null) {
            if (!clientes.existe(cliente.getRg())) {
                clientes.inserir(cliente);
            } else {
                clientes.atualizar(cliente);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
    public void remover(String rg) throws 
    ClienteNaoEncontradoException, RepositorioException {
        clientes.remover(rg);
    }
    public void atualizar(Cliente cliente) throws
    ClienteNaoEncontradoException, RepositorioException {
        clientes.atualizar(cliente);
    }
    public Cliente procurar(String rg) throws 
    ClienteNaoEncontradoException, RepositorioException {
        return clientes.procurar(rg);
    }
    public boolean existe(String rg) throws RepositorioException {
        return clientes.existe(rg);
    }
    public ResultSet listar(String sql) throws RepositorioException {
        return clientes.listar(sql);
    }
    
}
