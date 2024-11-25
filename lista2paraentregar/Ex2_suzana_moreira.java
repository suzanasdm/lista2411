/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2paraentregar;

import java.util.Scanner;

/*2. Crie uma função chamada imprime_vetor_int que receba um vetor de inteiro por parâmetro e faça a impressão 
na tela do vetor. 
*
 *
 * @author 60002070
 */
public class Ex2_suzana_moreira {

public static void main(String[]args){ 
    Scanner s = new Scanner(System.in);
    int num[]  = new int[5];
    
    for (int i = 0; i < 5; i++){
        System.out.println("digite um numero para essa posiçao"+ i + ":");
        num[i] = s.nextInt();
    
    }
    
    imprime_vetor_int(num);
            
    


}
public static   void imprime_vetor_int(int num[]){
    for(int i = 0; i < num.length; i++){
        System.out.println(num[i]+"");
        
}
}
}























    
    





