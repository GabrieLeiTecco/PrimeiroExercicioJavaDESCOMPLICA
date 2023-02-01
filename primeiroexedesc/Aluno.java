/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroexedesc;

/**
 *
 * @author osmaislindos
 */
class Aluno extends Pessoa{
    /*VARIAVEIS*/
    String nome;
    double teste, prova, media;

    /*GETTERS E SETTERS*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTeste() {
        return teste;
    }

    public void setTeste(double teste) {
        this.teste = teste;
    }

    public double getProva() {
        return prova;
    }

    public void setProva(double prova) {
        this.prova = prova;
    }
    
    public double getMedia(){
        return media = (teste+prova)/2;
    }
    
}
