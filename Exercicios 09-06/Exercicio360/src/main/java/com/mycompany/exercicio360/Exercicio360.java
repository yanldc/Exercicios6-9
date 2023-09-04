/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio360;
import javax.swing.JOptionPane;
/**
 *
 * @author yan-l
 */
public class Exercicio360 {

    public static void main(String[] args) {
        int[] ultDia = new int[12];
        int data, i, dia, mes;
        String[] signo = new String[12];
        String[] uDia = new String[12];
        String dataPe;
        
        for(i=0; i<12; i++){
            signo[i] = JOptionPane.showInputDialog("Digite o Signo");
            uDia[i] = JOptionPane.showInputDialog("Digite o Ultimo dia desse signo");
            ultDia[i] = Integer.parseInt(uDia[i]);
        }
        
        do{
          dataPe = JOptionPane.showInputDialog("Digite a data formato ddmm ou 9999 para encerrar o programa");
          data = Integer.parseInt(dataPe);
          
            dia = data / 100;
            mes = data % 100;
            mes--;
            
             if (dia > ultDia[mes]) {
                    mes = (mes + 1) % 12;
                }
              System.out.println("\nSigno: " + signo[mes] + "\n");
        }while( data != 9999);
    }
}
