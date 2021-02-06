/*
 * RepositorioCliente.java
 *
 * Created on 13 de Novembro de 2005, 00:50
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package siscorpi.cliente;
import java.sql.ResultSet;
import  siscorpi.util.RepositorioException;

/**
 *
 * @author sergio
 */
public interface RepositorioCliente {
    public ResultSet listar(String sql) throws RepositorioException;
    public void inserir(Cliente cliente) throws RepositorioException;
    public void remover(String rg) throws ClienteNaoEncontradoException, RepositorioException;
    public Cliente procurar(String rg) throws ClienteNaoEncontradoException, RepositorioException;
    public void atualizar(Cliente cliente) throws ClienteNaoEncontradoException, RepositorioException;
    public boolean existe(String rg) throws RepositorioException;
}
