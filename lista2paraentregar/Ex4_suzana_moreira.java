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
public class Ex4_suzana_moreira {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um número para a posição " + (i + 1) + ":");
            num[i] = s.nextInt();
        }

        ordena_vetor(num);

        System.out.println("Vetor ordenado:");
        for (int i : num) {
            System.out.print(i + " ");
        }
    }

    public static void ordena_vetor(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
    }
}

    

