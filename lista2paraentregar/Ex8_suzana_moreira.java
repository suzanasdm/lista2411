/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2paraentregar;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author suzana
 */
public class Ex8_suzana_moreira {
    
 public static void main(String[] args) {

        String numNCM;
        boolean encontrado;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um NCM: ");
        numNCM = s.next();

        encontrado = numeroNCM(numNCM);
        if (encontrado) {
            System.out.println("Este item é relacionado com informática.");
        } else {
            System.out.println("Este item NÃO está relacionado com informática.");
        }

    }

    public static boolean numeroNCM(String num) {

        boolean encontrado = false;
        String[] ncmInformatica = {"8471.30.10",
                                   "8471.30.90",
                                   "8471.41.00",
                                   "8471.49.00",
                                   "8528.52.00",
                                   "8528.59.00",
                                   "8443.32.01",
                                   "8443.32.99",
                                   "8471.60.00",
                                   "8471.70.11",
                                   "8471.70.12",
                                   "8473.30.11",
                                   "8473.30.19",
                                   "8471.60.20",
                                   "8471.60.90",
                                   "8517.62.11",
                                   "8517.62.19",
                                   "8471.50.00",
                                   "8471.70.90"};

        if (Arrays.asList(ncmInformatica).contains(num)) {
            encontrado = true;
        }

        return encontrado;
    }

}
