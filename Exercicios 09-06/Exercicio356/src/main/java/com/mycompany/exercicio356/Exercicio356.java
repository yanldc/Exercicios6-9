/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio356;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio356 {

    public static void main(String[] args) {
        int l;
        String[] nomes = new String[15];
        String[] nt1 = new String[15];
        String[] nt2 = new String[15];
        String[] sit = new String[15];
        float[] pr1 = new float[15]; 
        float[] pr2 = new float[15]; 
        float[] media = new float[15];
        
        //Entrada para 15 nomes com 30 caracteres
        for(l=0; l<=14; l++){
           nomes[l] = JOptionPane.showInputDialog("Digite o nome: ");
                while (nomes[l].length() > 30) {
                    System.out.println("Nomes com até 30 caracteres");
                    nomes[l] = JOptionPane.showInputDialog("Digite o nome com até 30 caracteres: ");
                } 
        }        
        for(l=0; l<=14; l++){
            nt1[l] = JOptionPane.showInputDialog("Digite a primeira nota de " + nomes[l]);
            pr1[l] = Float.parseFloat(nt1[l]);
            
            nt2[l] = JOptionPane.showInputDialog("Digite a segunda de " + nomes[l]);
            pr2[l] = Float.parseFloat(nt2[l]);
            
            media[l] = (pr1[l] + pr2[l])/2;
            
            if(media[l] >= 6){
                sit[l] = "AP";
            }else{
                sit[l] = "RP";
            }
        }
        
        System.out.println("RELAÇÃO FINAL");
        System.out.println("AP= Aprovado, RP= Reprovado");
        System.out.println("");
        for(l=0; l<=14; l++){
            System.out.println("\t"+ nomes[l] + "\t" + nt1[l] + "\t" + nt2[l] + "\t" + media[l] + "\t" + sit[l]);
        }
    }
}
