/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginiremedy;

import java.awt.*;
/**
 *
 * @author 010617041
 */
public class FormularioLogin extends Frame {
    
    protected Dimension dQuadro, dRotuloLogin, dRotuloSenha, dCaixaTextoLogin, dCaixaTextoSenha, dBotao;
    protected Button bEntrar, bEsqueciAsenha;
    protected TextField tfLogin, tfSenha;
    protected Label lLogin, lSenha;
    
    public FormularioLogin() {
        
        Dimension dQuadro = new Dimension(290,200);
        Dimension dRotuloLogin = new Dimension(45,25);
        Dimension dRotuloSenha = new Dimension(45,25);
        Dimension dCaixaTextoLogin = new Dimension(180,25);
        Dimension dCaixaTextoSenha = new Dimension(180,25);
        Dimension dBotao = new Dimension(100,25);
        
        setTitle("IRemedy Login");
        setResizable(true);
        setSize(dQuadro);
        setLocation(500,400);
        setLayout(null);
        
        lLogin = new Label("Login");
        lLogin.setSize(dRotuloLogin);
        lLogin.setLocation(25,50);
        
        tfLogin = new TextField();
        tfLogin.setSize(dCaixaTextoLogin);
        tfLogin.setLocation(80,50);
        
        lSenha = new Label("Senha");
        lSenha.setSize(dRotuloSenha);
        lSenha.setLocation(25,100);
        
        tfSenha = new TextField();
        tfSenha.setSize(dCaixaTextoSenha);
        tfSenha.setLocation(80,100);
        
        bEsqueciAsenha = new Button("Esqueci a Senha");
        bEsqueciAsenha.setSize(dBotao);
        bEsqueciAsenha.setLocation(25,150);
        
        bEntrar = new Button("Entrar");
        bEntrar.setSize(dBotao);
        bEntrar.setLocation(150,150);
        
        add(lLogin);
        add(tfLogin);
        add(lSenha);
        add(tfSenha);
        add(bEsqueciAsenha);
        add(bEntrar);
    }
}