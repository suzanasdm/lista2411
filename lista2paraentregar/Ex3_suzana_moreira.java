/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2paraentregar;

import java.util.Scanner;

/*3. Crie uma função chamada imprime_vetor_string que receba uma matriz de String por parâmetro e 
imprima os valores em tela. *
 *
 * @author suzana
 */
public class Ex3_suzana_moreira {public static void main(String[]args){ 
    
    String n[][]  = {
        { "Alice", "Bob", "Charlie"}, 
            {"David", "Eve", "Frank"}, 
            {"Grace", "Hank", "Ivy"}
    };
    
    imprime_vetor_String(n);
    

    
    
}
public static   void  imprime_vetor_String(String n[][]){
    for(int i = 0; i < n.length; i++){
        for (int j = 0; j < n[i].length; j++)
        { System.out.println(n[i][j] + " "); }    
    }
        }
        
        

}






















    

