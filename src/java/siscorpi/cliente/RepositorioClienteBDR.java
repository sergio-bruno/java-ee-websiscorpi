/*
 * RepositorioClienteBDR.java
 *
 * Created on 13 de Novembro de 2005, 00:52
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package siscorpi.cliente;
import  siscorpi.util.*;
import  java.sql.*;
/**
 *
 * @author sergio
 */
public class RepositorioClienteBDR implements RepositorioCliente  {
    
    /** Creates a new instance of RepositorioClienteBDR */
    public RepositorioClienteBDR() {
    }
    public void inserir(Cliente cliente) throws RepositorioException {
        try {
            Statement statement = ConnectionManager.reservaStatement();
            if (cliente != null) {
                try {
                    statement.executeUpdate(
                    "INSERT INTO clientes (rg,nome,cpf,endereco,telefone) Values ('"+
                    cliente.getRg()+"','"+cliente.getNome()+
                    "','"+cliente.getCpf()+"','"+cliente.getEndereco()+        
                    "','"+cliente.getTelefone()+"')");
                }
                catch (SQLException e) {
                    throw new RepositorioException(e);
    		}
            }
        } finally {
            ConnectionManager.liberaStatement();
        }
    }
    public void remover(String rg) throws ClienteNaoEncontradoException, 
    RepositorioException {
        try{
        Statement statement = ConnectionManager.reservaStatement();
	int resultado = statement.executeUpdate("DELETE FROM clientes WHERE rg='" + 
                        rg + "'");
        if (resultado == 0) {
            throw new ClienteNaoEncontradoException(rg);
        } 
        } catch(SQLException e){
            throw new RepositorioException(e);
        } finally {
            ConnectionManager.liberaStatement();
        }
    }
    public Cliente procurar(String rg) throws 
    ClienteNaoEncontradoException, RepositorioException {
        Cliente cliente = null;
        try {
            Statement statement = ConnectionManager.reservaStatement();
            ResultSet resultset = statement.executeQuery("SELECT * FROM clientes WHERE rg = '" + 
                                  rg + "'");
            if (resultset.next()) {
                cliente = new Cliente(resultset.getString("rg"),
                resultset.getString("nome"),resultset.getString("cpf"),
                resultset.getString("endereco"),resultset.getString("telefone"));
                resultset.close();
            } else {
                throw new ClienteNaoEncontradoException(rg);
            }
        } catch (SQLException e) {
            throw new RepositorioException(e);
	} finally {
            ConnectionManager.liberaStatement();
	}
	return cliente;
	}
	public void atualizar(Cliente cliente) throws 
        ClienteNaoEncontradoException, RepositorioException {
	    try {
    	    Statement statement = ConnectionManager.reservaStatement();
            if (cliente != null) {
                try { 
                    int resultado = statement.executeUpdate(
                    "UPDATE clientes SET "+"nome='"+cliente.getNome()+
                    "', cpf='"+cliente.getCpf()+
                    "', endereco='"+cliente.getEndereco()+
                    "', telefone='"+cliente.getTelefone()+"' WHERE rg = '"+cliente.getRg()+"'");
                    if (resultado == 0) {
                        throw new ClienteNaoEncontradoException(
                        cliente.getRg());
                    } 
                }
                catch (SQLException e) {
    			    throw new RepositorioException(e);
    		}
            }
        } finally {
            ConnectionManager.liberaStatement();
          }
	}
	public boolean existe(String rg) throws RepositorioException {
   	    boolean resposta = false;
            try {
                Statement statement = ConnectionManager.reservaStatement();
                ResultSet resultset = statement.executeQuery(
                                      "SELECT rg FROM clientes WHERE rg = '"+ 
                                      rg + "'");
                resposta = resultset.next();
                resultset.close();
            } catch (SQLException e) {
                throw new RepositorioException(e);
            } finally {
                ConnectionManager.liberaStatement();
            }
            return resposta;
    }
    public ResultSet listar(String sql) throws RepositorioException {
        try {
            Statement statement = ConnectionManager.reservaStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            throw new RepositorioException(e);
        } 
    }
    
}
