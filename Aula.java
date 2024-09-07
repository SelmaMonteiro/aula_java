package com.mycompany.aula;

import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {
      //Leitura//
      Scanner leia = new Scanner(System.in);
      
      ///Entrada de Dados//
      int valor;
      int pdesconto;
      int vdesconto;
      int pjuros;
      int vjuros;
      
     ///Entrada de dados manual//
System.out.println("****WINKS!!****"); //Nome da loja
System.out.println("Digite o valor da compra;");//Mostrar na tela//
valor = leia.nextInt();//Fazer a leitura do valor//

System.out.println("Digite a porcentagem do desconto:");
pdesconto =leia.nextInt();//Fazer a leitura do desconto;

System.out.println("Digite a porcentagem de juros:");
pjuros=leia.nextInt();//Fazer a leitura do desconto;

//Processamento//
vdesconto = valor * pdesconto;//calculo de desconto
vjuros = valor * pjuros;//calculo de juros


//System.out.println(vjuros);
//Saída//


       System.out.println("compra de " + valor + " com " + pdesconto + "% de desconto fica " + (valor-vdesconto)*-0.1);
       System.out.println("compra de " + valor + " com " + pjuros + "% de juros fica " + (valor+vjuros)*0.1);
        
      
    }
}
