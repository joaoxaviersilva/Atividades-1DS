/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author r1spo
 */
public class ex2 {
    public static void main(String[] args) {
        final int peixe=100;
        double peso= Double.parseDouble(JOptionPane.showInputDialog("Digite o peso em quilos do seus peixes: "));
        int multa = 8;
        double valor=0;
        if(peso>peixe){
            double excesso= peso-peixe;
            valor=multa*excesso;
            JOptionPane.showMessageDialog(null,"Você alcançou o limite máximo do peso. Sua multa é de: " + valor);
        }
        else{
            JOptionPane.showMessageDialog(null,"Parabéns, você está no limite de peso");
        }
    }
}
