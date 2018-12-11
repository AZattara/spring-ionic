package com.dpdnti.uema.dto;
import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import com.dpdnti.uema.services.validation.ClienteInsert;

import java.io.Serializable;

@ClienteInsert
public class ClienteNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    @NotEmpty(message="Preenchimento obrigatório")
    @Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres")
    private String nome;

    @NotEmpty(message="Preenchimento obrigatório")
    @Email(message="Email inválido")
    private String email;

    @NotEmpty(message="Preenchimento obrigatório")
    private String cpfOuCnpj;

    private Integer tipo;

    @NotEmpty(message="Preenchimento obrigatório")
    private String senha;

    @NotEmpty(message="Preenchimento obrigatório")
    private String logradouro;

    @NotEmpty(message="Preenchimento obrigatório")
    private String numero;

    private String complemento;

    private String bairro;

    @NotEmpty(message="Preenchimento obrigatório")
    private String cep;

    @NotEmpty(message="Preenchimento obrigatório")
    private String telefone1;

    private String telefone2;
    private String telefone3;

    private Integer cidadeId;

    public ClienteNewDTO() {
    }

    public String getNome() {
        return nome;
    }

    public ClienteNewDTO setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ClienteNewDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public ClienteNewDTO setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
        return this;
    }

    public Integer getTipo() {
        return tipo;
    }

    public ClienteNewDTO setTipo(Integer tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public ClienteNewDTO setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public ClienteNewDTO setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public ClienteNewDTO setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public ClienteNewDTO setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public ClienteNewDTO setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public ClienteNewDTO setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
        return this;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public ClienteNewDTO setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
        return this;
    }

    public String getTelefone3() {
        return telefone3;
    }

    public ClienteNewDTO setTelefone3(String telefone3) {
        this.telefone3 = telefone3;
        return this;
    }

    public Integer getCidadeId() {
        return cidadeId;
    }

    public ClienteNewDTO setCidadeId(Integer cidadeId) {
        this.cidadeId = cidadeId;
        return this;
    }

}
