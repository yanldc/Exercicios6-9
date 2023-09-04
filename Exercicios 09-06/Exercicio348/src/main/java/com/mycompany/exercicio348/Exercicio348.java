/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio348;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio348 {

    public static void main(String[] args) {
        int l;
        String[] nomes = new String[5];
        String[] nt1 = new String[5];
        String[] nt2 = new String[5];
        float[] pr1 = new float[5]; 
        float[] pr2 = new float[5]; 
        float[] media = new float[5];
        
        for(l=0; l<=4; l++){
            nomes[l] = JOptionPane.showInputDialog("Digite o nome: ");
            nt1[l] = JOptionPane.showInputDialog("Digite a primeira nota: ");
            pr1[l] = Float.parseFloat(nt1[l]);
            
            nt2[l] = JOptionPane.showInputDialog("Digite a segunda nota: ");
            pr2[l] = Float.parseFloat(nt2[l]);
            
            media[l] = (pr1[l] + pr2[l])/2;
        }
        
        for(l=0; l<=4; l++){
            System.out.println("O aluno: "+ nomes[l]);
            System.out.println("Com a primeira nota: "+ nt1[l] + ", e a segunda nota de: "+ nt2[l]+ ", teve a média de: "+ media[l]);
            System.out.println("");
        }
    }
}
