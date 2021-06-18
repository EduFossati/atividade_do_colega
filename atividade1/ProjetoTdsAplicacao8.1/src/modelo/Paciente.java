/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class Paciente {
    private String nome, medicacao,inicioIsolamento,fimIsolamento;
    private int cod_usuario;
    private ArrayList sintomas = new ArrayList<>();
    private int febre,tosse,semSintomas,dorDeCabeca,difRespirar,cansaco;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getInicioIsolamento() {
        return inicioIsolamento;
    }

    public void setInicioIsolamento(String inicioIsolamento) {
        this.inicioIsolamento = inicioIsolamento;
    }

    public String getFimIsolamento() {
        return fimIsolamento;
    }

    public void setFimIsolamento(String fimIsolamento) {
        this.fimIsolamento = fimIsolamento;
    }
    
    public void cadastrarSintomas(String sintoma){
        this.sintomas.add(sintoma);
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    //public ArrayList getSintomas() {
    //    return sintomas;
    //}

    //public void setSintomas(ArrayList sintomas) {
    //    this.sintomas = sintomas;
    //}


    public int getFebre() {
        return febre;
    }

    public void setFebre(int febre) {
        this.febre = febre;
    }

    public int getTosse() {
        return tosse;
    }

    public void setTosse(int tosse) {
        this.tosse = tosse;
    }

    public int getSemSintomas() {
        return semSintomas;
    }

    public void setSemSintomas(int semSintomas) {
        this.semSintomas = semSintomas;
    }

    public int getDorDeCabeca() {
        return dorDeCabeca;
    }

    public void setDorDeCabeca(int dorDeCabeca) {
        this.dorDeCabeca = dorDeCabeca;
    }

    public int getDifRespirar() {
        return difRespirar;
    }

    public void setDifRespirar(int difRespirar) {
        this.difRespirar = difRespirar;
    }

    public int getCansaco() {
        return cansaco;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }

   

    
    
    
    
    @Override
    public String toString() {
        return "\n\nNome: " + nome + "\nMedicacao: " + medicacao + "\nInicio do Isolamento: " + inicioIsolamento + "\nSintomas: " + sintomas;
    }

    public String cadastrarSintomas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
    
    

