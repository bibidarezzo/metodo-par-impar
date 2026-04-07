/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.one;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class One {
    // Método principal: executa o programa
    public static void main(String[] args) {

        int numero = Integer.parseInt(
        JOptionPane.showInputDialog(
        "Digite um número:"));
        
        // Verifica se é par ou ímpar, chamando o método
        String resultado = verificar(numero);
        
        // Exibe o resultado na tela
        JOptionPane.showMessageDialog(null,
        "O número " + numero + " é " + resultado);
        
    }
    // Método responsável por verificar se o número é par ou ímpar
    public static String verificar(int n) {

        String resultado = "";

        if (n % 2 == 0) {
            resultado = "par";
        } else {
            resultado = "ímpar";
        }
        return resultado;
        
    }
    
}
