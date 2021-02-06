/*
 * Pedido.java
 *
 * Created on 18 de Agosto de 2005, 23:33
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */
package siscorpi.pedido;
import java.sql.ResultSet;
import  siscorpi.produto.*;
import  siscorpi.cliente.*;
import  siscorpi.util.RepositorioException;
/**
 *
 * @author sergio
 */
public class Pedido {
    private CadastroCliente clientes; 
    private CadastroProduto produtos;
    /** Creates a new instance of Pedido */
    public Pedido() {
        initCadastros();
    }
    private void initCadastros(){
        RepositorioCliente repositorioCliente = new RepositorioClienteBDR();
        clientes = new CadastroCliente(repositorioCliente);

        RepositorioProduto repositorioProduto = new RepositorioProdutoBDR();
        produtos = new CadastroProduto(repositorioProduto);
    }
    // CLIENTES
    public void cadastrarCliente(Cliente cliente) throws 
    ClienteNaoEncontradoException, RepositorioException {
        clientes.cadastrar(cliente);  
    }
    public Cliente procurarCliente(String rg) throws 
    ClienteNaoEncontradoException, RepositorioException  {
        return clientes.procurar(rg);
    }
    public void atualizarCliente(Cliente cliente) throws 
    ClienteNaoEncontradoException, RepositorioException {
        clientes.atualizar(cliente);
    }
    public boolean existeCliente(String rg) throws RepositorioException  {
        return clientes.existe(rg);
    }
    public void removerCliente(String rg) throws 
    ClienteNaoEncontradoException, RepositorioException {
        clientes.remover(rg);
    }
    public ResultSet listarCliente(String sql) throws RepositorioException  {
        return clientes.listar(sql);
    }
    // PRODUTOS
    public void cadastrarProduto(Produto produto) throws 
    ProdutoNaoEncontradoException, RepositorioException {
        produtos.cadastrar(produto);  
    }
    public Produto procurarProduto(String codigo) throws 
    ProdutoNaoEncontradoException, RepositorioException  {
        return produtos.procurar(codigo);
    }
    public void atualizarProduto(Produto produto) throws 
    ProdutoNaoEncontradoException, RepositorioException {
        produtos.atualizar(produto);
    }
    public boolean existeProduto(String codigo) throws RepositorioException  {
        return produtos.existe(codigo);
    }
    public void removerProduto(String codigo) throws 
    ProdutoNaoEncontradoException, RepositorioException {
        produtos.remover(codigo);
    }
    public ResultSet listarProduto(String sql) throws RepositorioException  {
        return produtos.listar(sql);
    }
}