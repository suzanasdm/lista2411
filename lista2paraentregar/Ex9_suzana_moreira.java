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
public class Ex9_suzana_moreira {
    

    public static void main(String[] args) {

        String nome, nomeAlt;
        int anoNasc;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        nome = s.next();

        System.out.println("Digite o ano de nascimento: ");
        anoNasc = s.nextInt();
        
        nomeAlt = nomeEAno(nome, anoNasc);
        
        System.out.println("Nome alterado: " + nomeAlt);
    }

    public static String nomeEAno(String nome, int ano) {
        boolean primo = primo(ano);
        String nomeAlt = nome;
        if (primo){
            nomeAlt = nomeAlt.replace('a', '@');
            nomeAlt = nomeAlt.replace('e', '!');
        } else {
            nomeAlt = nomeAlt.replace('e', '#');
            nomeAlt = nomeAlt.replace('o', '*');
        }
        return nomeAlt;
    }

    public static boolean primo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
