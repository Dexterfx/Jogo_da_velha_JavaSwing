/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.*;//O * vai buscar todos os códigos da biblioteca
import javax.swing.JOptionPane;

/**
 *
 * @author NASA-PC
 */
public class banco {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost:5432/ranking";
    private final String usuario = "postgres";
    private final String senha = "lucaspeixoto";
    public Connection conn;
    
    public void conexao(){//responsável por realizar a conexão com o banco
        
        try {//tentativa inicial
            System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexão
            conn = DriverManager.getConnection(caminho, usuario, senha);//realiza a conexão com o banco
            JOptionPane.showMessageDialog(null, "O banco foi conectado com sucesso!");
        } catch (SQLException ex) {//excessão
            JOptionPane.showMessageDialog(null, "Erro de conexão.\n Erro: "+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de desconectar.\n Erro: "+ex.getMessage());
        }
    }
}