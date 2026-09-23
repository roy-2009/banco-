/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author roy63042026
 */
public class PessoaFisica extends Conta {
  
    private String cpf ;

    public String getCpf() {
        return cpf;
    }

    public PessoaFisica(String cpf, String usuario, double saldo) {
        super(usuario, saldo);
        this.cpf = cpf;
    }
        @Override
    public void extrato (){
       System.out.println("cpf " + this.cpf);
       super.extrato();
       System.out.println("______________________________" );  
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
