/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroexedesc;

/**
 *
 * @author osmaislindos
 */
public class principal {
    public static void main(String[] args){
        /*ALUNO*/
        Aluno aluno = new Aluno();
        
        aluno.setNome("Gabriel Leite Tecco");
        aluno.setProva(10);
        aluno.setTeste(6);
        
        System.out.println("O aluno "+aluno.getNome()+" ficou com "+aluno.getMedia()+" pontos de média.");
        
        /*PROFESSOR*/
        Professor prof = new Professor();
        
        prof.setNome("Oswaldo");
        prof.setSalario(2000);
        
        System.out.println("O professor "+prof.getNome()+" recebe um salario de "+prof.getSalario());
        System.out.println("Mas o INSS é de "+prof.getINSS()+" e o salario liquido fica "+prof.getSalarioLqd());
    }
}
