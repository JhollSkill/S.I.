/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usarformprofessor;

/**
 *
 * @author 010617041
 */
public class Professor {
    private String nome;
    private int idade;
    
        public Professor(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public String getNome() {
            return nome;
        }
        
        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public String exibirProfessor()
            {
            return "nome: " + this.nome + "\n idade: " + this.idade;
            }
}
