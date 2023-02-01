/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroexedesc;

/**
 *
 * @author osmaislindos
 */
public class Professor {
    /*VARIAVEIS*/
    String nome;
    double salario;

    /*GETTERS E SETTERS*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    double getINSS(){
        return salario * 0.11;
    }
    
    double getSalarioLqd(){
        return salario - getINSS();
    }
}
