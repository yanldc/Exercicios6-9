/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio358;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio358 {

    public static void main(String[] args) {
           float[] precoCompra = new float[5];
           float[] precoVenda = new float[5];
           float[] lucro = new float[5];
           String[] compra = new String[5];
           String[] venda = new String[5];
           
           int totalLucroMenor10, totalLucroMenor20, totalLucroMaior20, a;
           
           totalLucroMenor10 = 0;
           totalLucroMenor20 = 0;
           totalLucroMaior20 = 0;
           
           for(a=0; a<=4; a++){
            compra[a] = JOptionPane.showInputDialog("Preço de compra ");
            precoCompra[a] = Float.parseFloat(compra[a]);
            
            venda[a] = JOptionPane.showInputDialog("Preço de venda ");
            precoVenda[a] = Float.parseFloat(venda[a]);
           }
           for(a=0; a<=4; a++){
               lucro[a] = ((precoVenda[a] - precoCompra[a]) / precoCompra[a]) * 100;
             
               if(lucro[a] < 10){
                   totalLucroMenor10++;
               } else if(lucro[a] <= 20){
                   totalLucroMenor20++;
                 }else{
                   totalLucroMaior20++;
                   }
           }
           System.out.println("Total de mercadorias que dao menos que 10% de lucro: "+ totalLucroMenor10);
           System.out.println("Total de mercadorias que dao entre 10 e 20% de lucro: "+ totalLucroMenor20);
           System.out.println("Total de mercadorias que dao mais que 20% de lucro: "+ totalLucroMaior20);
    }
}
