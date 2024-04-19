
package DAO;
import DTO.*;
import javax.swing.JOptionPane;

public class PessoaDAO {
    
    
    public PessoaDAO(){
        
    }
    public void imprimirPessoa(PessoaDTO objPessoaDTO){
        String nome;
        nome = objPessoaDTO.getLogin();
        
        JOptionPane.showMessageDialog(null, nome);
        
    }
}
