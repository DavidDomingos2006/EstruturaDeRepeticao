
package main;


import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
       
        //projeto lançado no github
            int n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Somando valores</html> ", "Digite aqui"));
            int resultado = 0, par = 0, impar = 0, maior100 = 0, contador = 0;
            double media = 0;
            while(n!=0){
                ++contador;
                if((n%2) == 0){
                
                par++;}else{
                impar++;
                }
                if(n>100){
                maior100++;}
                resultado += n;
                media = (double)resultado/contador;
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe o proximo numero <br> <em>Digite \"0\" para encerrar</em></html>"));
                
            }
            
            
            JOptionPane.showMessageDialog( null, "<html>Resultado Final <hr> <br> "
                    + "Total de impares: " + impar + "<br>Total de pares: " + par +
                    "<br>Soma total: "+ resultado+ "<br>Números acima de 100: "+ maior100+
                    "<br>Média total: "+ media + "</html>");
            
            
            
            
    }
    
}
