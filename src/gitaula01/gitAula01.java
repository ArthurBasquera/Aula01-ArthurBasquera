/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitaula01;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Arthur Basquera
 */
public class gitAula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome =  scanner.nextLine();
        
        System.out.println(nome +" bem vindo ao GitHub");
    */
       String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
       JOptionPane.showMessageDialog(null, nome+" Bem vindo ao gitHub!");
       System.exit(0);
    }
    
}
