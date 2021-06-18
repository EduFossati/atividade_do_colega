/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Conexao {
    private static String URL = "jdbc:mysql://localhost:3306/em_casa?zeroDateTimeBehavior=convertToNull";
    private static String USUARIO = "root";
    private static String SENHA = "";
    
    public static Connection getConexao()throws SQLException{
        Connection c=null;
        
        try{
            c = DriverManager.getConnection(URL,USUARIO,SENHA);
        }
        catch(SQLException e){
            throw new SQLException("Erro ao conectar"+e.getMessage());
        }
        return c;
    } 
}
