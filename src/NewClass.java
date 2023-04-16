/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class NewClass {
    /* Atividade I - Programação II
   Análise e Desenvolvimento de Sistemas
   Ana Carolina Anastacio - 21043452-5
*/


      public static void main(String[] args) {
         
          int soma = 0, i=1;
          int contImpar = 0;
          int media = 0; 
          
          while (i <=1000){
            soma += i;
            i += 2;
            
            if(i% 2 == 1){
                contImpar++;
          }
            
          media = soma/contImpar;  
          
        
}       System.out.println("Soma dos numeros ímpares: " +soma);
        System.out.println("Media dos números ímpares: " +media);
        System.out.println("Quantidade de números ímpares: " +contImpar);
}
}

