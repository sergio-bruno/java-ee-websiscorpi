/*
 * Cliente.java
 *
 * Created on 13 de Novembro de 2005, 00:38
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
public class Cliente {
    private String rg;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    
    /** Creates a new instance of Cliente */
    public Cliente(String rg, String nome, String cpf, String endereco, String telefone) {
        this.setRg(rg);
        this.setCpf(cpf);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
