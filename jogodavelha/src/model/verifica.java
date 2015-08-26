
package model;

import javax.swing.JOptionPane;


public class verifica {
    String[] btn = new String[5];

    public void verificacao(int bt, char simbolo){
    btn[bt] = String.valueOf(simbolo);
    
    if(btn[0].equals("X") && btn[1].equals("X") && btn[3].equals("X")){
        JOptionPane.showMessageDialog(null, "Jogador1 Venceu!");
    }
}
}
