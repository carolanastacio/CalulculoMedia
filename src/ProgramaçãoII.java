
/* Atividade I - Programação II
   Análise e Desenvolvimento de Sistemas
   Ana Carolina Anastacio - 21043452-5
*/

import java.util.Scanner; 
public class ProgramaçãoII{  
    
private static double calcularvardelta(int a,  int b,  int c) throws IllegalArgumentException{
double vardelta = Math.pow(b,2) - 4*a*c;
        
if (vardelta<0) {
    throw new IllegalArgumentException("vardelta é: "+vardelta+"\nNão existem raízes reais.");
 }
        

else if  (vardelta> 0.0)   {  
double y1 = (-b + Math.sqrt(vardelta)) / (2 * a);
            double r2 = (-b - Math.sqrt(vardelta)) / (2 * a); 
            System.out.println("O valor de vardelta é " + vardelta); 
            System.out.println("O valor de y1 é " + y1); 
            System.out.println("O valor de r2 é "+ r2); 

}   
else if (vardelta == 0.0) {  
double y1 = -b / (2.0 * a);  
System.out.println("A raíz é: " + y1);  
}
return vardelta;
}
public static void main(String[] Strings)   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Insira o valor de a: ");  
int a = (int) input.nextDouble();  
System.out.print("Insira o valor de b: ");  
int b = (int) input.nextDouble();  
System.out.print("Insira o valor de c: ");  
int c = (int) input.nextDouble();  
    calcularvardelta(a, b, c);
}  
}
