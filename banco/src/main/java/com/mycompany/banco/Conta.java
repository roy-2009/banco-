/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author roy63042026
 */
public class Conta {
   private String usuario;
   private double saldo;       
  
   public Conta (String usuario){
   this.usuario = usuario;
   this.saldo = 0.00;
  }
   
   public String getUsuario(){
       return this.usuario;
   }
      
   
   public double getSaldo(){
       return this.saldo;
      }
      
   
   public void setUsuario(String usuario){
     this.usuario = usuario ;
   }  
      
      
      
      
      
   public void depositar (double valor){
        if (valor > 0)   
       this.saldo = this.saldo + valor;
       else{
       System.out.println("o usuario : " + this.usuario + "nao pode depositar um valor negativo");
       }
   }     
   
   
   
   public void sacar (double valor){
       if (valor > 0 && valor <= this.saldo)   
       this.saldo = this.saldo - valor;
       else{
       System.out.println("erro");
       }
   
   }       
   
   public void extrato (){
       System.out.println("Saldo: " + this.saldo);
   }       
          

          
}
