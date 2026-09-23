/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author roy63042026
 */
public class Banco {

    public static void main(String[] args) {
       
  PessoaFisica antonio = new PessoaFisica("12345634554","Antonio",23.45);     
  PessoaJuridica lojinha = new PessoaJuridica("2345678","bijuterias da ju",23456.70);  
  
  
  antonio.extrato();
  lojinha.extrato();
     
    }
}
