/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio351;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio351 {

    public static void main(String[] args) {
        int l, num;
        String[] nomes = new String[5];
        String busca;
        
        for(l=0; l<=4; l++){
            nomes[l] = JOptionPane.showInputDialog("Indice: "+ (l+1) +" Digite o nome: ");
        }
            busca = JOptionPane.showInputDialog("Digite o número de índice da pessoa: ");
            num = Integer.parseInt(busca);
        
        if (num >= 1 && num <= 5) {
            System.out.println("Nome no índice " + num + ": " + nomes[num - 1]);
        } else {
            System.out.println("Numero fora do intervalo");
        }
    }
}
