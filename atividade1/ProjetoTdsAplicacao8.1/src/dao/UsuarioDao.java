/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Usuario;
import persistencia.Conexao;

/**
 *
 * @author user
 */
public class UsuarioDao {
     public void cadastrarUsuario(Usuario u) throws SQLException{
        Connection con = Conexao.getConexao();
        
        Statement stat  = con.createStatement();
        
        try{
          String sql;
          sql="insert into usuario(cod_usuario,nome,data_nascimento,telefone,cep,rua,complemento,bairro,cidade,estado,pais)" 
                  +"values(null,'"+u.getNome()+"','"+u.getDataNascimento()+"',"+u.getTelefone()+","+u.getCep()+",'"+u.getRua()+"','"+u.getComplemento()+"','"+u.getBairro()+"','"+u.getCidade()+"','"+u.getEstado()+"','"+u.getPais()+"')";
          
                 
                  
                  stat.execute(sql);
          
        }
        catch(SQLException e){
            throw new SQLException("Erro ao inserir Usuário");
        }finally{
            //Serve para fechar as conexões
            stat.close();
            con.close();
        }
}
     
     public void cadastrarEndereco (Usuario e) throws SQLException{
         Connection con = Conexao.getConexao();
         
         Statement stat = con.createStatement();
         
         try{
             String sql;
             sql="insert into endereco(cod_usuario,pais,estado,cidade,bairro,rua,cep)"
                     +"values(null,'"+e.getPais()+"','"+e.getEstado()+"','"+e.getCidade()+"','"+e.getBairro()+"','"+e.getRua()+"',"+e.getCep()+")";
             
             stat.execute(sql);
         }
         catch(SQLException ex){
            throw new SQLException("Erro ao inserir Endereço");
        }finally{
            //Serve para fechar as conexões
            stat.close();
            con.close();
        }
             
     }
}
