package gitHub;

import javax.swing.*;

public class cadastroSenhaJava {

    public static void main(String[] args) {
        String cadastroSenha;
        String confirmaSenha;
        
        cadastroSenha = JOptionPane.showInputDialog(null, "Digite a nova senha.", "", JOptionPane.QUESTION_MESSAGE);

        confirmaSenha = JOptionPane.showInputDialog(null, "Confirme a nova senha. ", "", JOptionPane.QUESTION_MESSAGE);

        if (confirmaSenha.equals(cadastroSenha)) {
            JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Ops! As senhas não conferem.", "", JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);
    }
}
