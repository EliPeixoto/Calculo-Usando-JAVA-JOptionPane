
package LivroJava8cap2;
import javax.swing.JOptionPane;
/**
Exercicio 3 Livro java8 capitulo 2 Pagina 41
 */
public class ITBIExercicio {
    public static void main(String[] args) {
        float calculo, transacao, venal, percentual;
        String aux;
        try{
            
            aux = JOptionPane.showInputDialog("Entre com o valor da transação \n (o valor negociado) :");
            transacao = Float.parseFloat(aux);
            
           aux = JOptionPane.showInputDialog("Entre com o valor venal de referência\n (Fornecido pela Prefeitura):");
            venal = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Entre com o percentual de imposto:");
            percentual = Float.parseFloat(aux);
            
            if (transacao > venal) {
                calculo = transacao * percentual/100;
       }else{
                calculo = venal * percentual/100;
            }
            
         JOptionPane.showMessageDialog(null, "O valor do imposto a ser pago é: R$ "+ calculo);   

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Houve erro no calculo, digite apenas caracteres numericos \n"
                   + erro.toString());
        
    }
        System.exit(0);
}
}

    
