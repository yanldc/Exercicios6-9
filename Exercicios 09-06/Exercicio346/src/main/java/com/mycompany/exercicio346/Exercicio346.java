/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio346;
import javax.swing.JOptionPane;

/**
 *
 * @author yan-l
 */
public class Exercicio346 {

    public static void main(String[] args) {
        String frase;
        String op;
        int x, tam;
        
         do{
            System.out.println("Menu");
            System.out.println("l - Imprime o comprimento da frase ");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");     
            
            op = JOptionPane.showInputDialog("Escolha a opção: ");
            
             switch(op) {
            case "1":
                frase = JOptionPane.showInputDialog("Digite uma frase: ");
                tam = frase.length();
                System.out.println("O numero de caracteres da frase é: " + tam);
                System.out.println(" ");
                break;
                
            case "2":
                frase = JOptionPane.showInputDialog("Digite uma frase: ");
                System.out.println("Na frase: " + frase);
                System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
                tam = frase.length() - 2;
                System.out.println("Os dois ultimos caracteres: " + frase.substring(tam));
                System.out.println(" ");
                break;
                
            case "3":
                frase = JOptionPane.showInputDialog("Digite uma frase: ");
                tam = frase.length();
                StringBuilder fraseEspelhada = new StringBuilder();
    
                for (x = tam - 1; x >= 0; x--) {
                    fraseEspelhada.append(frase.charAt(x));
                }
    
                System.out.println("Frase espelhada: " + fraseEspelhada.toString());
                System.out.println(" ");
                break;
       
            case "4":
                System.exit(0);
                break;
                
            default:
                System.out.println("Opção inválida.");
                System.out.println(" ");
                break;
        }
        }while (!op.equals("4"));
    }
}
