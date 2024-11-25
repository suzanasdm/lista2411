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
public class Ex10_suzana_moreira { 
    public static void main(String[] args) {
        
        String matrizNomes[][] = {{"maria laura","00000000"},
                                  {"caio henrique","97342658"},
                                  {"Felipe augusto","12334963"},
                                  {"luiza barbora da silva","65192037"},
                                  {"marcos eduardo ","28416739"},
                                  {"suzana moreira" ,"80739512"},
                                  {"Gabriel amorim","16348290"},
                                  {"pablo  lucas","43806175"},
                                  {"Bolosnaro lulinha","69057461"},
                                  {"Dilma da bicicleta","74703924"}};
        String nome;
        
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite um nome: ");
        nome = s.next();
        
        String[][] filtrados = busca_aluno(matrizNomes, nome);
        
        if(filtrados.length > 0){
            for (int i=0; i < filtrados.length; i++){
                System.out.println("Nome: " + filtrados[i][0] + " RA: " + 
                                    filtrados[i][1]);
            }
        }
        
    }
    
    public static String[][] busca_aluno(String[][] matrizNomes, String nome){
        
        int count=0;
        for (int i=0; i < matrizNomes.length; i++){
            if (matrizNomes[i][0].toLowerCase().contains(nome.toLowerCase())){
                count++;
            }
        }
        String alunos[][]  = new String [count][2] ;
        
        int j=0;
        for (int i=0; i < matrizNomes.length; i++){
            if (matrizNomes[i][0].toLowerCase().contains(nome.toLowerCase())){
                alunos[j]=matrizNomes[i];
                j++;
            }
        }
        return alunos;
    }
   
    
}
    

