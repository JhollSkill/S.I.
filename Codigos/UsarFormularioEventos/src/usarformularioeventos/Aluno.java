/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usarformularioeventos;

import javax.swing.JOptionPane;

/**
 *
 * @author 010617041
 */
public class Aluno {
    private String nome;
    
public Aluno (String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void validarAluno(String variavelnome) {
    
if (this.getNome().equals(variavelnome)) {
    JOptionPane.showMessageDialog(null, " Aluno(a) " + this.nome + " autorizado! " );
}else
    {
        JOptionPane.showMessageDialog(null, " Aluno(a) " + variavelnome + " desconhecido! ");
    }
  }
    
}
