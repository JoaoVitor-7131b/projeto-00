
package main1;

import javax.swing.JOptionPane;


public class Main1 {

    
    public static void main(String[] args) {
      
        String firstnumber = 
              JOptionPane.showInputDialog("escreva o primeiro número!");
             
         String secondtnumber = 
              JOptionPane.showInputDialog("escreva o SEGUNDO número!");
         
         int number1= Integer.parseInt(firstnumber);
         int number2= Integer.parseInt(secondtnumber);
         
        
        int sum = number1+number2;
        
       JOptionPane.showMessageDialog(null,"A SOMA É="+sum+" Soma dos dois números"+ JOptionPane.PLAIN_MESSAGE);
    }
    
}
