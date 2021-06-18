/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author user
 */
public class Usuario {
    private String nome,rua,complemento,bairro,cidade,estado,pais,dataNascimento;//modifiquei o dataNascimento de Date para String.
    private long telefone,cep;/*Modifiquei o telefone e cep de Int para Long visto que um Int por ser 32bits só consegue segurar 
numeros até 2147483647(10 digitos) e um numero de telefone tem mais numeros do que isso.
*/
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "USUARIO" + "\n\nNome: " + nome + "\nData de Nascimento: " + dataNascimento + "\nTelefone: " + telefone + "\nCep: " + cep + "\nRua: " + rua + "\nComplemento: " + complemento + "\nBairro: " + bairro + "\nCidade: " + cidade + "\nEstado: " + estado + "\nPais: " + pais;
                
                
                
    }

    
    
}
