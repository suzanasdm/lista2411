/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2paraentregar;

import java.util.Scanner;

/**
 *
 * @author suzana
 */
public class Ex7_suzana_moreira { public static void main(String[] args) {
        
        String nome = "";
        
        retornaNome(nome);
        
    }
    
    public static void retornaNome(String nome){
        nome = "";
        Scanner s = new Scanner (System.in);
        
        while(nome.length() < 10){
            System.out.println("Informe um produto (min 10 caracteres): ");
            nome = s.next();
            if (nome.length() < 10){
                System.out.println("Nome deve conter ao menos 10 caracteres!");
            }
        }
        
        System.out.println("\nPRODUTO VÁLIDO: " + nome);
        
    }
    
}
    

