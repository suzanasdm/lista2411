/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2paraentregar;

import java.util.Scanner;

/*1. Crie uma função chamada divisão, com retorno real e que receba dois valores por parâmetros. 
Se o divisor for igual a 0, ela deve 
retornar 0. Se não, deve retornar a divisão entre eles.*
 *
 * @author 60002070
 */
public class Ex1_suzana_moreira {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num1 , num2 ;
        System.out.println("Ensira um numero:");
        num1 = s.nextInt();
        System.out.println("Ensira o divisor:");
        num2 = s.nextInt();
        System.out.println("Retorno:" + divisao(num1,num2));
        
        
        
    }
    public static int divisao(int num1 , int num2){
if(num2   ==0){
return  0;

}
else{
return num1 / num2;
}
        
}
    
    
}
    

