/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author roy63042026
 */
public class PessoaJuridica extends Conta{
  
   private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public PessoaJuridica(String cnpj, String usuario, double saldo) {
        super(usuario, saldo);
        this.cnpj = cnpj;
    }

    @Override
    public void extrato (){
       System.out.println("cnpj " + this.cnpj);

       System.out.println("______________________________" );
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
